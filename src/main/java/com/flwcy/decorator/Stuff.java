package com.flwcy.decorator;

/**
 * 为了满足开闭原则
 * 调料
 */
public abstract class Stuff implements Drink {
    private Drink drink;
    public Stuff(Drink drink){
        this.drink = drink;
    }

    public String make(){
        return String.format("%s,加了%s",drink.make(),stuffName());
    }

     abstract String stuffName();
}
