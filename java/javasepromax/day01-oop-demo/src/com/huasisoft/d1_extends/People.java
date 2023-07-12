package com.huasisoft.d1_extends;

public class People {
    private String name;
    private int age;

    public People() {
        System.out.println("People 无参构造器");
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

    public void show() {
        System.out.println("name: " + this.getName() + ", age: " + this.getAge());
    }
}
