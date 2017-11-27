package com.flwcy.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        // 就是一个代理对象
        ProxySubject vpn = new ProxySubject();

        // 通过VPN（代理对象）访问Facebook
        vpn.requestFacebook();//执行的是代理的方法
    }
}
