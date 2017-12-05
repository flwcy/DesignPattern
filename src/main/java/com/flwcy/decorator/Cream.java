package com.flwcy.decorator;

/**
 * 具体装饰(ConcreteDecorator)角色
 */
public class Cream extends Stuff {

    public Cream(Pastry pastry) {
        super(pastry);
    }

    protected String stuffName() {
        return "奶油";
    }
}
