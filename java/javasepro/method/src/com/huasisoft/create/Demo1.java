package com.huasisoft.create;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(sub(1, 2));
        System.out.println(mul(1, 2));
    }


    // 有参数，有返回值
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
}
