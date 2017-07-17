package com.seed.thread;

/**
 * Created by OL on 2017/7/14.
 */
public class VolatileTest implements Runnable{
    private volatile int counter=0;
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
