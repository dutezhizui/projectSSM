package com.seed.domain.po;

/**
 * Created by Administrator on 2017/3/19.
 * 定义一个返回结果类
 */
public class Result<T> extends BaseEntity {
    private int statusCode;
    private T data;
    private String message;
    public Result(){}
    public Result(int statusCode,T data,String message){
        this.statusCode=statusCode;
        this.data=data;
        this.message=message;
    }
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isOK(){
        if (this.statusCode==0)
            return true;
        return false;
    }
    public boolean isError(){
        if (this.statusCode!=0)
            return true;
        return false;
    }
}
