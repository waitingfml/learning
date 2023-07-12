package com.huasisoft.branch;

public class SwitchDemo {
    int a;

    static boolean b = true;

    public static void main(String[] args) {
        SwitchDemo.timer();
        SwitchDemo switchDemo = new SwitchDemo();

        System.out.println(b);


        // 分支结构switch
        // 表达式数据格式
        // byte,short,int,char,枚举类型(JDK1.5)，String类型(JDK1.7)
        // switch(表达式) {
        //     case 值1:
        //         语句体1;
        //         break;
        //     case 值2:
        //         语句体2;
        //         break;
        //     ...
        //     default:
        //         语句体n+1;
        // }

        // 执行流程：首先计算表达式的值，然后和case后面的值依次比较，如果有对应的值，就执行对应的语句体，如果没有对应的值，就执行default后面的语句体
        // 注意：break是可选的，如果没有break，就会出现case穿透现象
        // 注意：default是可选的，如果没有default，就什么都不做
        // 注意：switch后面的小括号中只能是byte,short,int,char,枚举类型(JDK1.5)，String类型(JDK1.7)
        // 注意：case后面只能是常量，不能是变量，不能是表达式，不能是null，不能是方法，不能是比较运算符，不能是位运算符，不能是三元运算符，不能是数组
        // 注意：case后面的值不能重复
        // 注意：default后面的语句体可以放在任意位置，但是一般放在最后
        // 注意：switch后面的小括号中的表达式和case后面的值的数据类型必须一致
        // 注意：switch后面的小括号中的表达式不能是long类型的
        // 注意：switch后面的小括号中的表达式不能是float类型的
        // 注意：switch后面的小括号中的表达式不能是double类型的
        // 注意：switch后面的小括号中的表达式不能是boolean类型的
        // 注意：switch后面的小括号中的表达式不能是数组类型的
        // 注意：switch后面的小括号中的表达式不能是对象类型的
        // 注意：switch后面的小括号中的表达式不能是接口类型的
        // 注意：switch后面的小括号中的表达式不能是枚举类型的
        // 注意：switch后面的小括号中的表达式不能是void类型的
        // 注意：switch后面的小括号中的表达式不能是常量，只能是变量
        // 注意：switch后面的小括号中的表达式不能是null
        // 注意：switch后面的小括号中的表达式不能是方法
        // 注意：switch后面的小括号中的表达式不能是比较运算符
        // 注意：switch后面的小括号中的表达式不能是位运算符
        // 注意：switch后面的小括号中的表达式不能是三元运算符
        // 注意：switch后面的小括号中的表达式不能是数组
        // 注意：switch后面的小括号中的表达式不能是接口
        // 注意：switch后面的小括号中的表达式不能是枚举
        // 注意：switch后面的小括号中的表达式不能是void
        // 注意：switch后面的小括号中的表达式不能是常量，只能是变量
        // 注意：switch后面的小括号中的表达式不能是null
        // 注意：switch后面的小括号中的表达式不能是方法
        // 注意：switch后面的小括号中的表达式不能是比较运算符
        switch (switchDemo.a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println(switchDemo.a);
        }
    }

    // 写一个定时器，每秒输出一个数，输出到100时，停止
    public static void timer() {
        SwitchDemo switchDemo = new SwitchDemo();
        switchDemo.a = 0;
        do {
            switchDemo.a++;
            System.out.println(switchDemo.a);
        } while (switchDemo.a != 100);
    }
}
