package com.flwcy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MapProxy implements InvocationHandler {
    private Object target;

    public MapProxy(Object target) {
        this.target = target;
    }

    public static Object factory(Object obj){
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),new MapProxy(obj));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("Before calling:" + method);
        result = method.invoke(target, args);
        System.out.println("After calling:" + method);
        return result;
    }

    public static void main(String[] args) {
        Map map = (Map)factory(new HashMap<Object,String>());
        map.put("name","flwcy");

        System.out.println(map.get("name"));

        System.out.println(map);
    }
}
