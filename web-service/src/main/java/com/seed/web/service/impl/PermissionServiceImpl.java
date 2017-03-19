package com.seed.web.service.impl;

import com.seed.core.generic.GenericDao;
import com.seed.core.generic.GenericServiceImpl;
import com.seed.web.dao.PermissionMapper;
import com.seed.web.model.Permission;
import com.seed.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }

    @Override
    public List<Permission> selectByPage(Permission permission) {
        return permissionMapper.selectByPage(permission);
    }
}
