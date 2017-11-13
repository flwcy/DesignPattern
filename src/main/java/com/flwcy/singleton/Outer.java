package com.flwcy.singleton;

/**
 * https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 * 加载一个类时，其内部类不会同时被加载。一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
 */
public class Outer {
    static {
        System.out.println("load out class");
    }

    public class Inner{
/*        static {
            System.out.println("load inner class...");
        }

        static void innerMethod(){
            System.out.println("static inner method...");
        }*/

        public Inner(){
            System.out.println("load inenr class...");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("==========分割线========== ");
        //Outer.Inner.innerMethod();
    }
}
