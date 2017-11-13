package com.flwcy.decorator;

/**
 * 红豆
 */
public class RedBeans extends Stuff {
    public RedBeans(Drink drink){
        super(drink);
    }
    public String stuffName(){
        return "红豆";
    }
}
