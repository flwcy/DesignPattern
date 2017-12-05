package com.flwcy.decorator;

/**
 * 具体组件角色(ConcreteComponent) :被装饰者
 */
public class Cake implements Pastry {

    public String make() {
        return "蛋糕";
    }
}
