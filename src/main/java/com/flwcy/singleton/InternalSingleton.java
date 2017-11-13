package com.flwcy.singleton;

/**
 * 静态内部类
 */
public class InternalSingleton {

private static class SingletonHolder{
    private static final InternalSingleton INSTANCE = new InternalSingleton();
}

private InternalSingleton(){
    System.out.println("init....");
}

public static InternalSingleton getInstance(){
    return SingletonHolder.INSTANCE;
}
}
