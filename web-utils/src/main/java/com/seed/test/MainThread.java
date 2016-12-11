package com.seed.test;

/**
 * Created by Administrator on 2016/12/11.
 */
public class MainThread {
    public static void main(String args[]){
        /*LiftOff launch=new LiftOff();
        launch.run();
        LiftOff launch2=new LiftOff(5);
        launch2.run();*/

        /*Thread thread=new Thread(new LiftOff());
        thread.start();

        for (int i=0;i<5;i++){
            Thread thread1=new Thread(new LiftOff());
            thread1.start();
            System.err.println("Waiting for LiftOff");
        }*/
        Thread thread=new Thread(new TestThread());
        thread.start();
    }
}
