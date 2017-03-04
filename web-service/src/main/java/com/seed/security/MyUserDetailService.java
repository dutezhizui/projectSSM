
package com.seed.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.seed.web.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    //登陆验证时，通过username获取用户的所有权限信息，
    //并返回User放到spring的全局缓存SecurityContextHolder中，以供授权器使用
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException {
        Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();
        com.seed.web.model.User record=new com.seed.web.model.User();
        record.setUsername(username);
        com.seed.web.model.User Tuser=userMapper.selectUserByName(username);
        if (Tuser==null){
            String message="User:"+username+"does not exist!";
            throw new UsernameNotFoundException(message);
        }
        String passWord=Tuser.getPassword();

        List<com.seed.web.model.User> listRole=userMapper.selectRoleByUserName();
        for (int i=0;i<listRole.size();i++){
            SimpleGrantedAuthority grantedAuthorityImpl = new SimpleGrantedAuthority(listRole.get(i).getUserRole());
            auths.add(grantedAuthorityImpl);
        }



        User user = new User(username, passWord, true, true, true, true, auths);
        return user;
    }
}