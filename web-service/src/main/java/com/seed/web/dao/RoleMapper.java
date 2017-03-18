package com.seed.web.dao;

import com.seed.core.generic.GenericDao;
import com.seed.web.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色Dao 接口
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:55:59
 **/
@Repository
public interface RoleMapper extends GenericDao<Role, Long> {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Role record);

    /**
     * 通过用户id 查询用户 拥有的角色
     *
     * @param userId
     * @return
     *
     */
    List<Role> selectRolesByUserId(Long userId);

    List<Role> selectAllRoles();
}