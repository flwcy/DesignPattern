package com.flwcy.proxy;

/**
 * 真实角色（网民）
 */
public class RealSubject implements Subject {

    public void requestFacebook() {
        System.out.println("访问Facebook");// 真实角色的操作：真正的业务逻辑
    }
}
