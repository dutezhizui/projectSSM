package com.seed.web.controller;

import com.seed.core.feature.orm.mybatis.Page;

import java.util.List;

/**
 * Created by OL on 2017/4/17.
 */
public class PageData {
    private List items;
    private boolean last;
    private int currentPageNumber;
    public PageData(){}
    public PageData(List items,boolean last,int currentPageNumber){
        this.items=items;
        this.last=last;
        this.currentPageNumber=currentPageNumber;
    }
    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }
}
