package com.seed.domain.po;

/**
 * Created by Administrator on 2017/3/19.
 * 分页实体类
 */
public class PageEntity<T> extends BaseEntity {
    public PageEntity(){}
    //总页数
    private int totalPage;
    //总条数
    private int totalCount;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }



    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
