package com.seed.designPattern.decoratorPattern.sample;

/**
 * 装饰类，给构件类添加附属功能
 */
public class Change implements TheGreatestSage{
    private TheGreatestSage theGreatestSage;
    public Change(TheGreatestSage theGreatestSage){
        this.theGreatestSage=theGreatestSage;
    }
    @Override
    public void move() {
        theGreatestSage.move();
    }
}
