package com.flwcy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 每一个动态代理类都必须要实现 InvocationHandler 这个接口
 */
public class InvocationHandlerImpl implements InvocationHandler {

    /**
     *  这个就是我们要代理的真实对象
     */
    private Object obj;//这是动态代理的好处，被封装的对象是Object类型，接受任意类型的对象

    public InvocationHandlerImpl(Object obj){
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before calling:" + method);
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object result = method.invoke(obj, args);
        // 在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after calling:" + method);
        return result;
    }
}
