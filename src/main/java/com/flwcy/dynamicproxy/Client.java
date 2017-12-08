package com.flwcy.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

/**
 * 动态代理演示
 */
public class Client {

    public static void main(String[] args) {
        // 我们要代理的真实对象
        RealSubject realSubject = new RealSubject();
        /**
         * DynamicProxy 实现了 InvocationHandler 接口，并能实现方法调用从代理类到委托类的分派转发
         * 其内部通常包含指向委托类实例的引用，用于真正执行分派转发过来的方法调用.
         * 即：要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法
         */
        InvocationHandler handler = new DynamicProxy(realSubject);
        // 通过Proxy的newProxyInstance方法来创建我们的代理对象
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);

        //这里可以通过运行结果证明subject是Proxy的一个实例，这个实例实现了Subject接口
        System.out.println(subject instanceof Proxy);

        //这里可以看出subject的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了Subject接口
        System.out.println("subject的Class类是："+subject.getClass().toString());

        subject.request();
        System.out.println(subject.sayHello("flwcy"));

        // 将生成的字节码保存到本地
        createProxyClass(realSubject.getClass().getInterfaces());
    }

    private static void createProxyClass(Class<?>[] interfaces){
        String proxyName = "ProxySubject";
        BufferedOutputStream out = null;
        File file = new File(String.format("E:/tmp/%s.class",proxyName));

                    /*
             * Generate the specified proxy class.
             */
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                proxyName, interfaces, Modifier.PUBLIC);

        try {
            out = new BufferedOutputStream(new FileOutputStream(file));
            out.write(proxyClassFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
