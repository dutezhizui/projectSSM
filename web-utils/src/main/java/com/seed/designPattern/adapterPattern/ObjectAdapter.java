package com.seed.designPattern.adapterPattern;

/**
 * 对象适配器
 * 直接关联被适配的类
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public String request() {
        adaptee.specialRequest();
        return "special Request";
    }
}
