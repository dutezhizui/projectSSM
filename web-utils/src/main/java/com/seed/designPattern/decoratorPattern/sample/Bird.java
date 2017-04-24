package com.seed.designPattern.decoratorPattern.sample;

/**
 * 具体装饰类，fish给猢狲类增加了在水里游的能力
 */
public class Bird extends Change{
    public Bird(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.err.println("Bird Move");
    }
}
