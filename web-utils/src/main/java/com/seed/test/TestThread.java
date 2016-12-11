package com.seed.test;

/**
 * Created by Administrator on 2016/12/11.
 */
public class TestThread implements Runnable{
    public TestThread(){
        System.err.println("thread start!");
    }
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.err.println("thread is running");
            Thread.yield();
        }
        System.out.println("thread end");
    }
}
