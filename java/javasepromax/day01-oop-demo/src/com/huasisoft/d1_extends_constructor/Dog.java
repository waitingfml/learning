package com.huasisoft.d1_extends_constructor;

public class Dog  extends Animal{

    public Dog() {
        System.out.println("Dog 无参构造器");
    }


    public Dog(String name) {
        System.out.println("Dog 有参构造器");
    }
}