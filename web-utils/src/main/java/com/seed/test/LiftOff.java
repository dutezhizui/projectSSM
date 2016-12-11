package com.seed.test;

/**
 * Created by Administrator on 2016/12/11.
 */
public class LiftOff implements Runnable {
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public LiftOff(){

    }
    public LiftOff(int countDown){
        this.countDown=countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+"),";
    }
    @Override
    public void run() {
    while (countDown-->0){
        System.out.println(status());
        Thread.yield();
    }
    }
}
