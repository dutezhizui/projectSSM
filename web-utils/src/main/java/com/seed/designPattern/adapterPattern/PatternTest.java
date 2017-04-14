package com.seed.designPattern.adapterPattern;

/**
 * 测试类
 */
public class PatternTest {
    public static void main(String args[]){
        Adapter adapter=new Adapter();
        adapter.request();
        Adaptee adaptee=new Adaptee();
        ObjectAdapter objectAdapter=new ObjectAdapter(adaptee);
        objectAdapter.request();
    }
}
