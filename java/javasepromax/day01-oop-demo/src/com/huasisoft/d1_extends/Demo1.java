package com.huasisoft.d1_extends;

public class Demo1 {
    public static void main(String[] args) {
        // 目标:理解继承的特点。
        // 1、子类不能继承父类的构造器
        // 2、子类是否可以继承父类的私有成员?
        // 3、子类是否可以继承父类的静态成员? 不算继承，是共享

        B b = new B();
        // System.out.println(b.a); 私有成员可以被继承，但是不能被访问
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);

        System.out.println(B.e); //


    }
}

class A {
    private int a; // 私有成员：只能在本类中访问
    public int b; // 公共成员：可以在任意地方访问
    protected int c; // 受保护成员：只能在本类和子类中访问
    int d; // 默认成员


    static int e; // 静态成员
}

class B extends A {
}