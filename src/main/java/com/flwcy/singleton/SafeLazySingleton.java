package com.flwcy.singleton;

/**
 * 懒汉式，线程安全
 * 效率不高
 */
public class SafeLazySingleton {

    private static SafeLazySingleton instance;

    private SafeLazySingleton(){}

    public synchronized static SafeLazySingleton getInstance(){
        if(instance == null){
            instance = new SafeLazySingleton();

        }

        return instance;
    }

}
