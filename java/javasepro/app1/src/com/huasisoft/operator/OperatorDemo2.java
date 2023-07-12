package com.huasisoft.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标：加号做连接符的识别
        System.out.println("加号做连接符的识别");
        System.out.println("hello" + "World"); // helloWorld
        System.out.println("hello" + 10); // hello10
        System.out.println("hello" + 10 + 20); // hello1020
        System.out.println(10 + 20 + "hello"); // 30hello

        // 目标：自增自减运算符的识别
        System.out.println("自增自减运算符的识别");
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13
        System.out.println(a++ + b); // 13
        System.out.println(a); // 11
        System.out.println(++a + b); // 15
        System.out.println(a); // 12


        // 自增自减运算符
        int c = 10;
        int d = c++; // 先赋值再自增
        System.out.println("先赋值再自增");
        System.out.println(d); // 10
        System.out.println(c); // 11

        int e = 10;
        int f = ++e; // 先自增再赋值
        System.out.println("先自增再赋值");
        System.out.println(e); // 11
        System.out.println(f); // 11

        // += -= *= /= %=
        int g = 10;
        int h = 20;
        System.out.println("+= -= *= /= %=");
        g += h; // g = g + h;
        System.out.println(g); // 30
        g -= h; // g = g - h;
        System.out.println(g); // 10
        g *= h; // g = g * h;
        System.out.println(g); // 200
        g /= h; // g = g / h;
        System.out.println(g); // 10
        g %= h; // g = g % h;
        System.out.println(g); // 10




    }
}
