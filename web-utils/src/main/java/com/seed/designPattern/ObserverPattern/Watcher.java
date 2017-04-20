package com.seed.designPattern.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者对象，实现Observer接口
 * 提供update方法，
 */
public class Watcher implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.err.println("get args="+arg);
    }
}
