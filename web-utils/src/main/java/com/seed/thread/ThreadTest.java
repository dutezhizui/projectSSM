package com.seed.thread;

/**
 * Created by Administrator on 2017/5/7.
 */
public class ThreadTest {
    public static void main(String args[]){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1");
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2");
            }
        });
        thread1.start();
        thread2.start();
    }
}
