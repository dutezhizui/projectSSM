package com.seed.designPattern.adapterPattern;

/**
 * 需要配适的类，已存在的、具有特殊功能、但不符合现有接口标准(Target)的类
 */
public class Adaptee {
    public String specialRequest(){
        System.err.println("special Request");
        return "special Request";
    }
}
