package com.seed.web.service;

import com.seed.core.generic.GenericService;
import com.seed.web.model.Permission;

import java.util.List;

/**
 * 权限 业务接口
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:02:39
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

    /**
     * 根据对象查询分页信息
     */
    List<Permission> selectByPage(Permission permission);
}
