package com.seed.designPattern.decoratorPattern.source;

/**
 * 抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。

 　具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。

 　装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。

 　具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public interface Component {
    void sampleOperation();
}
