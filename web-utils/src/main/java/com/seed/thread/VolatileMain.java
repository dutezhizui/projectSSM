package com.seed.thread;

/**
 * Created by OL on 2017/7/14.
 */
public class VolatileMain {
    public static void main(String args[]){
        VolatileTest volatileTest=new VolatileTest();
        for (int i=0;i<1000;i++){

            Thread thread=new Thread(volatileTest);
            thread.start();
        }
        System.err.println("counter="+volatileTest.getCounter());
    }
}
