package com.huasisoft.encapsulation;

public class Student {

    private String name;
    protected int age;

    public Student() {
        System.out.println("Student类的无参构造方法被调用了");

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student类的有参构造方法被调用了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
