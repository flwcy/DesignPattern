package com.flwcy.entity;

import java.io.Serializable;

/**
 * 如果希望把一个对象通过ObjectOutputStream写到文件中，这个对象必须实现Serializable接口
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 3898449493380681871L;
    private int id;
    private String name;

    /**
     * 只要一个属性设置为transient之后，这个属性就不会被存储
     */
    private transient int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
