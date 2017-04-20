package com.seed.designPattern.ObserverPattern;

/**
 * Created by OL on 2017/4/20.
 */
public class Test {
    public static void main(String args[]){
        Watched watched=new Watched();
        Watcher watcher =new Watcher();
        watched.addObserver(watcher);
        System.err.println(watched.countObservers());

        watched.setData("test");
    }
}
