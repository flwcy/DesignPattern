package com.flwcy.dynamicproxy;

/**
 * 真实角色
 */
public class RealSubject implements Subject {
    public String sayHello(String name) {
        return String.format("Hello,%s",name);
    }

    public void request() {
        System.out.println("From real subject.");
    }
}
