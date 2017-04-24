package com.seed.designPattern.decoratorPattern.sample;

/**
 * 定义一个具体构件，猢狲类
 */
public class Monkey implements TheGreatestSage{
    @Override
    public void move() {
        System.err.println("Monkey Move");
    }
}
