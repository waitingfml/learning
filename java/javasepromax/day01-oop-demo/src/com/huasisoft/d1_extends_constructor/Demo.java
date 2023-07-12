package com.huasisoft.d1_extends_constructor;

public class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d1 = new Dog("xxx");

        System.out.println(d);
        System.out.println(d1);
    }
}
