package com.flwcy.decorator;

/**
 * 珍珠
 */
public class Pearl extends Stuff {
    public Pearl(Drink drink){
        super(drink);
    }

    public String stuffName(){
        return "珍珠";
    }
}
