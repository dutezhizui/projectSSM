package com.seed.security;

import java.util.*;

import com.seed.web.dao.PermissionMapper;
import com.seed.web.dao.RoleMapper;
import com.seed.web.dao.UserMapper;
import com.seed.web.model.Permission;
import com.seed.web.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.seed.utils.url.AntUrlPathMatcher;
import com.seed.utils.url.UrlMatcher;

import javax.annotation.PostConstruct;

public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    private UrlMatcher urlMatcher = new AntUrlPathMatcher();
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
@Autowired
private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    //tomcat启动时实例化一次
    /*public MyInvocationSecurityMetadataSource() {
        loadResourceDefine();
    }*/
    //tomcat开启时加载一次，加载所有url和权限（或角色）的对应关系
    @PostConstruct
    private void loadResourceDefine() {
        List<Role> roles=roleMapper.selectAllRoles();

        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
        for (int i=0;i<roles.size();i++){
            Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
            ConfigAttribute ca = new SecurityConfig(roles.get(i).getRoleName());
            atts.add(ca);
            List<Permission> permissions=permissionMapper.selectPermissionsByRoleId(roles.get(i).getId());
            for (int j=0;j<permissions.size();j++){
                resourceMap.put(permissions.get(j).getPermissionSign(),atts);
            }

        }

    }

    //参数是要访问的url，返回这个url对于的所有权限（或角色）
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // 将参数转为url
        String url = ((FilterInvocation)object).getRequestUrl();
        Iterator<String>ite = resourceMap.keySet().iterator();
        while (ite.hasNext()) {
            String resURL = ite.next();
            if (urlMatcher.pathMatchesUrl(resURL, url)) {
                return resourceMap.get(resURL);
            }
        }
        return null;
    }
    public boolean supports(Class<?>clazz) {
        return true;
    }
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
}
