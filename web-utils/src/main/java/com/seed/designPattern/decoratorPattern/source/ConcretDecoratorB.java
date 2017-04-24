package com.seed.designPattern.decoratorPattern.source;

/**
 * 具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 */
public class ConcretDecoratorB extends Decorator {
    public ConcretDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
    }
}
