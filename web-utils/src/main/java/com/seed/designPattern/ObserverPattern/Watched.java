package com.seed.designPattern.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 被观察者
 * Created by OL on 2017/4/20.
 */
public class Watched extends Observable {
    private String data="";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)){
            this.data=data;
            setChanged();
            notifyObservers(data);
        }

    }


}
