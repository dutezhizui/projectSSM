package com.seed.core.orm;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/12.
 */
public class BaseDaoImpl extends SqlSessionDaoSupport implements BaseDao {
    @Override
    public void addObject(String statementName, Object obj) throws DataAccessException {
        getSqlSession().insert(statementName,obj);

    }

    @Override
    public int deleteObject(String statementName, String objId) throws DataAccessException {
        return 0;
    }

    @Override
    public int deleteForMap(String statementName, Map<String, Object> map) throws DataAccessException {
        return 0;
    }

    @Override
    public Object findObject(String statementName, String objId) throws DataAccessException {
        return null;
    }

    @Override
    public int updateObject(String statementName, Object obj) throws DataAccessException {
        return 0;
    }

    @Override
    public int updateObjectState(String statementName, Map<String, Object> map) throws DataAccessException {
        return 0;
    }

    @Override
    public int getObjectCount(String statementName, String filter) {
        return 0;
    }

    @Override
    public int getObjectCount(String statementName, Map<String, Object> map) {
        return 0;
    }

    @Override
    public Object findObject(String statementName, Map<String, Object> map) {
        return null;
    }

    @Override
    public List listByPage(String statementName, Map<String, Object> map, int skipResults, int pageSize) {
        return null;
    }

    @Override
    public List listByPage(String statementName, String filter, int skipResults, int pageSize) {
        return null;
    }

    @Override
    public List list(String statementName, String filter) {
        return null;
    }

    @Override
    public List list(String statementName, Map<String, Object> map) {
        return null;
    }
}
