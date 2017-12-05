package com.flwcy.app;

import com.flwcy.decorator.Cake;
import com.flwcy.decorator.Chocolate;
import com.flwcy.decorator.Cream;
import com.flwcy.decorator.Pastry;
import com.flwcy.singleton.InternalSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 一个蛋糕
        Pastry cake = new Cake();
        System.out.println(cake.make());
        // 一个奶油蛋糕
        Pastry creamCake = new Cream(new Cake());
        System.out.println(creamCake.make());
        Pastry chocolateCake = new Chocolate(new Cream(new Cake()));
        System.out.println(chocolateCake.make());
    }
}
