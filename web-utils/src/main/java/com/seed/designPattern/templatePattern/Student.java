package com.seed.designPattern.templatePattern;

/**
 * 学生类
 */
public class Student extends AbstractPerson {

    @Override
    public void dressUp() {
        System.err.println("穿校服");
    }

    @Override
    public void eatBreakfast() {
        System.err.println("吃早餐");
    }

    @Override
    public void takeThings() {
        System.err.println("拿课本");
    }
}
