package com.flwcy.decorator;

/**
 * 装饰(Decorator)角色
 * 为了满足开闭原则
 * 配料
 */
public abstract class Stuff implements Pastry {

    private Pastry pastry;

    public Stuff(Pastry pastry){
        this.pastry = pastry;
    }

    protected abstract String stuffName();

    public String make(){
        return String.format("%s%s",stuffName(),pastry.make());
    }
}
