package com.huasisoft.branch;

import java.util.Date;

public class IfDemo {
    public static void main(String[] args) {
        // 分支结构if
        // if(条件表达式) {
        //     语句体1;
        // } else {
        //     语句体2;
        // }
        // 执行流程：先判断条件表达式是否为true，如果为true，执行语句体1，如果为false，执行语句体2
        // 注意：else是可选的
        // 注意：if后面的小括号中只能是布尔类型，不能是其他类型
        // 注意：if后面的小括号中不能是赋值语句，只能是逻辑运算符或者关系运算符
        // 注意：if后面的小括号中不能是常量，只能是变量
        // 注意：if后面的小括号中不能是表达式，只能是关系运算符或者逻辑运算符连接起来的式子
        // 注意：if后面的小括号中不能是null
        // 注意：if后面的小括号中不能是方法
        // 注意：if后面的小括号中不能是比较运算符
        // 注意：if后面的小括号中不能是位运算符
        // 注意：if后面的小括号中不能是三元运算符
        // 注意：if后面的小括号中不能是数组

        // 定一个一个变量，赋值为当前的月份
        Date date = new Date();// 获取当前时间
        long x = date.getTime();
        int y = 20;
        System.out.println(getType(x));
        System.out.println(getType(y));
        if (x > y) {
            System.out.println(x);
            System.out.println("x > y");
        } else {
            System.out.println("x <= y");
        }
    }

    // 获取变量类型
    public static String getType(Object o) {
        return o.getClass().getName();
    }
}
