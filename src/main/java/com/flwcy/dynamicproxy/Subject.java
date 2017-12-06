package com.flwcy.dynamicproxy;

/**
 * 抽象角色，真实角色与代理角色均需要实现该接口
 * 动态代理只能代理接口
 */
public interface Subject {

    public String sayHello(String name);

    public void request();
}
