package com.seed.designPattern.decoratorPattern.sample;

/**
 * 具体装饰类，fish给猢狲类增加了在水里游的能力
 */
public class Fish extends Change{
    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.err.println("Fish Move");
    }
}
