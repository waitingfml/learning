package com.huasisoft.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 学会使用键盘录入数据
        // 1.导包
        // import java.util.Scanner;
        // 2.创建对象
        // Scanner sc = new Scanner(System.in);
        // 3.接收数据
        // int i = sc.nextInt();
        // 4.输出数据
        // System.out.println(i);
        // 5.释放资源
        // sc.close();


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        System.out.println("输入的整数为：" + i);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        System.out.println("输入的字符串为：" + s);
        System.out.println("请输入一个小数：");
        double d = sc.nextDouble();
        System.out.println("输入的小数为：" + d);
        System.out.println("请输入一个布尔值：");
        boolean b = sc.nextBoolean();
        System.out.println("输入的布尔值为：" + b);
        sc.close();


        // 引用数据类型分类
        // 1.类
        // 2.接口
        // 3.数组
        // 4.枚举
        // 5.注解
        // 6.字符串
        // 7.日期
        // 8.集合
        // 9.自定义引用数据类型
        // 10.自定义类
        // 11.自定义接口
        // 12.自定义数组
        // 13.自定义枚举




    }
}
