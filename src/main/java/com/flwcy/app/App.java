package com.flwcy.app;

import com.flwcy.decorator.Drink;
import com.flwcy.decorator.MilkyTea;
import com.flwcy.decorator.Pearl;
import com.flwcy.decorator.RedBeans;
import com.flwcy.singleton.InternalSingleton;
import com.flwcy.singleton.Outer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "组合优于继承" );
        // 做一杯奶茶
        Drink milkyTea = new MilkyTea();
        System.out.println(milkyTea.make());
        Pearl pearl = new Pearl(milkyTea);
        // 加珍珠的奶茶
        System.out.println(pearl.make());
        // 加红豆的奶茶
        System.out.println(new RedBeans(pearl).make());

        InternalSingleton instance = InternalSingleton.getInstance();
    }
}
