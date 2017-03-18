package com.seed.web.dao;

import com.seed.core.generic.GenericDao;
import com.seed.web.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ??? Dao ???
 *
 * @author StarZou
 * @since 2014??7??5?? ????11:59:03
 **/
@Repository
public interface PermissionMapper extends GenericDao<Permission, Long> {

    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);


    Permission selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Permission record);


    /**
     * 根据roleId查询权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}