package com.seed.testThread;

/**
 * Created by OL on 2017/2/17.
 */
public class Task implements Runnable{
    private String name;
    private int age;
    public Task(){}
    public Task(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void run() {
        System.err.println("threadName="+Thread.currentThread().getName()+"->"+"userName="+name+":"+"age="+age);

    }
}
