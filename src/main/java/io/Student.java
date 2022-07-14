package io;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private int age;
//    transient使某个成员变量的值不想被序列化
//    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}