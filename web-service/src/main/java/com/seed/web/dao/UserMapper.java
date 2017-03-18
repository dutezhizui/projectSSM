package com.seed.web.dao;

import com.seed.core.generic.GenericDao;
import com.seed.web.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户Dao接口
 *
 * @author StarZou
 * @since 2014年7月5日 上午11:49:57
 **/
@Component
public interface UserMapper extends GenericDao<User, Long> {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);


    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    /**
     * 用户登录验证查询
     *
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    List<User> selectRoleByUserName();
    User selectUserByName(@Param("userName") String userName);
}