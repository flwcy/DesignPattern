package com.flwcy.proxy;

public class ProxyPattern {
    public static void main(String[] args) {

        // 中介
        ProxySubject agency = new ProxySubject();

        agency.tenement();//执行的是代理的方法
    }
}
