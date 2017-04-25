package com.seed.designPattern.templatePattern;

/**
 * 行为模式--模板方法模式
 * 模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，
 * 然后声明一些抽象方法来迫使子类实现剩余的逻辑。
 * 不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。
 * 这就是模板方法模式的用意
 *
 * 优点
 模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
 子类实现算法的某些细节，有助于算法的扩展。
 通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。

 缺点
 每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
 */
public abstract class AbstractPerson {
    public void prepareGoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
    }
    public abstract void dressUp();
    public abstract void eatBreakfast();
    public abstract void takeThings();
}
