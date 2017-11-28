package com.flwcy.proxy;

/**
 * 代理角色（VPN）
 */
public class ProxySubject implements Subject {

    /**
     * 真实角色（网民）
     */
    private Subject user = new RealSubject(); //代理角色内部持有真实角色的引用

    public void requestFacebook() {
        // 获取Facebook的数据（真实角色操作之前所附加的操作）
        System.out.println("获取Facebook的数据");

        // 网民需要访问Facebook，只是代理
        user.requestFacebook();

        // 记录用户本次访问用了多少流量（真实角色操作之后所附加的操作）
        System.out.println("已用40M流量");
    }
}
