package com.seed.designPattern.adapterPattern;

/**
 * 适配器，将特殊功能得类适配成一般功能的接口
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public String request() {
        return super.specialRequest();
    }
}
