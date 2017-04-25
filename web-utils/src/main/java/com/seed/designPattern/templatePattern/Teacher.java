package com.seed.designPattern.templatePattern;

/**
 * 教师类
 */
public class Teacher extends AbstractPerson {
    @Override
    public void dressUp() {
        System.err.println("穿工作服");
    }

    @Override
    public void eatBreakfast() {
        System.err.println("吃早餐");
    }

    @Override
    public void takeThings() {
        System.err.println("带学生考试的试卷");
    }
}
