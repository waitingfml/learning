package com.huasisoft.variable;

public class VariableDemo2 {
    public static  void main(String[] args) {
        int a = 10;

        {
            String b = "hello";
            System.out.println(b);
        }

        System.out.println(a);
        // System.out.println(b); // 编译错误，b的作用域在代码块内

        // 字符存储
        System.out.println("字符存储");
        char c = 'a';
        System.out.println(c + 1);


        // 定义一个二进制变量
        System.out.println("二进制变量");
        int binary = 0b101; // 0b 开头的整数是二进制
        System.out.println(binary);

        // 定义一个八进制变量
        int octal = 0101; // 0 开头的整数是八进制
        System.out.println("八进制变量");
        System.out.println(octal);

        // 定义一个十六进制变量
        System.out.println("十六进制变量");
        int hex = 0x101; // 0x 开头的整数是十六进制
        System.out.println(hex);


    }
}
