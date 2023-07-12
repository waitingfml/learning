package com.huasisoft.literal;

public class LiteralDemo {

    public static void main(String[] args) {
        // 整数
        System.out.println(10);
        // 小数
        System.out.println(10.0);
        // 字符
        System.out.println('a');
        // 字符串
        System.out.println("Hello World!");
        // 布尔
        System.out.println(true);
        // 空
        System.out.println(" "); // null


        // 特殊字符
        System.out.println("\n"); // 换行
        System.out.println("\t"); // 制表符
        System.out.println("\b"); // 退格
        System.out.println("\r"); // 回车
        System.out.println("\f"); // 换页
        System.out.println("'"); // 单引号
        System.out.println("\""); // 双引号
        System.out.println("\\"); // 反斜杠

        // 转义字符
        System.out.println("Hello\tWorld!");
        System.out.println("Hello\nWorld!");
        System.out.println("Hello\rWorld!");
        System.out.println("Hello\bWorld!");
        System.out.println("Hello\fWorld!");
        System.out.println("Hello'sWorld!");
        System.out.println("Hello\"World!");

        // 字符串拼接
        System.out.println("Hello" + "World!");
        System.out.println("Hello" + 10);
        System.out.println("Hello" + 10 + 20);
        System.out.println(10 + 20 + "Hello");
        System.out.println("Hello" + (10 + 20));

        // 字符串和任意类型拼接
        System.out.println("字符串和任意类型拼接");
        System.out.println("Hello" + new Object());
        System.out.println("Hello" + new Object().toString());
        System.out.println("Hello" + new Object().hashCode());
        System.out.println("Hello" + Object.class);
        System.out.println("Hello" + Object.class.getName());
        System.out.println("Hello" + Object.class.getName().hashCode());
        System.out.println("Hello" + Object.class.getName().hashCode() + "World!");
        System.out.println("Hello" + Object.class.getName().hashCode() + 10);
        System.out.println("Hello" + Object.class.getName().hashCode() + 10 + 20);
        System.out.println(Object.class.getName().hashCode() + 10 + 20 + "Hello");
        System.out.println("Hello" + (Object.class.getName().hashCode() + 10 + 20));



    }
}
