package com.flwcy.proxy;

/**
 * 真实角色（房东）
 */
public class RealSubject implements Subject {

    public void tenement() {
        System.out.println("我是房东，出租两室一厅");
    }
}
