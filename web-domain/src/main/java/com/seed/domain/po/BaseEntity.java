package com.seed.domain.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/19.
 * 基础类，定义一个对象的基本属性
 */
public class BaseEntity implements Serializable {
    private Long Id;
    private Date createDate;
    private Date updateDate;
    private int pageNum;
    private int pageSize;

    public BaseEntity() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
