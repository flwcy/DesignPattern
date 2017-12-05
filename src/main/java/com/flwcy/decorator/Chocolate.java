package com.flwcy.decorator;

public class Chocolate extends Stuff {

    public Chocolate(Pastry pastry) {
        super(pastry);
    }

    protected String stuffName() {
        return "巧克力";
    }
}
