package com.huasisoft.create;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        // 方法常见问题
        // 1. 方法不能嵌套定义
        // 2. void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
        // 3. return后面不能加代码，因为执行不到
        // 4. 方法的定义顺序无所谓
        // 5. 方法的重复定义，不允许的
        // 6. 方法的重载，允许的
        // 7. 方法的调用，可以多次调用
        // 8. 方法的参数，可以是基本类型，也可以是引用类型
        // 9. 方法的参数，可以是多个，也可以没有
        // 10. 方法的返回值，可以是基本类型，也可以是引用类型
        // 11. 方法的返回值，可以是多个，也可以没有

        print();
        print(2);
        print(2, 3);
        print(2, 3, 4);
    }

    // 2. void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
    public static void print() {
        System.out.println("Hello world!");
        return; // 可以省略
    }

    // 3. return后面不能加代码，因为执行不到
    public static void print2() {
        System.out.println("Hello world!");
        return ;
        // System.out.println("Hello world!"); // 错误的,因为执行不到
    }

    // 4. 方法的定义顺序无所谓
    public static void print3() {
        print();
        print2();
    }

    /*
     5. 方法的重复定义，不允许的
     public static void print() {
         System.out.println("Hello world!");
     }
    */

    // 6. 方法的重载，允许的
    public static void print(int a) {
        System.out.println("print 方法重载 " + a);
    }

    public static void print(int a, int b) {
        System.out.println("print 方法重载 " + a + b);
    }

    public static void print(int a, int b, int c) {
        System.out.println("print 方法重载 " + a + b + c);
    }

    // 7. 方法的调用，可以多次调用
    public static void print4() {
        System.out.println("方法的调用，可以多次调用");
        print();
        print();
        print();
    }

    // 8. 方法的参数，可以是基本类型，也可以是引用类型
    public static void print5(int a, int b) {
        System.out.println("方法的参数，可以是基本类型，也可以是引用类型");
        System.out.println(a + b);
    }

    public static void print5(int[] arr) {
        System.out.println("方法的参数，可以是基本类型，也可以是引用类型");
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void print5(double[] arr) {
        System.out.println("方法的参数，可以是基本类型，也可以是引用类型");
        for (double j : arr) {
            System.out.println(j);
        }
    }



    // 9. 方法的参数，可以是多个，也可以没有
    public static void print6() {
        System.out.println("方法的参数，可以是多个，也可以没有");
    }

    public static void print6(int a, int b) {
        System.out.println("方法的参数，可以是多个，也可以没有");
    }


    // 10. 方法的返回值，可以是基本类型，也可以是引用类型
    public static int print7() {
        System.out.println("方法的返回值，可以是基本类型，也可以是引用类型");
        return 1;
    }

    public static int[] print8() {
        System.out.println("方法的返回值，可以是基本类型，也可以是引用类型");
        return new int[]{1, 2, 3};
    }

    // 11. 方法的返回值，可以是多个，也可以没有
    public static int print9() {
        System.out.println("方法的返回值，可以是多个，也可以没有");
        return 1;
    }

    // 返回值多个，用数组
    public static int[] print10() {
        System.out.println("方法的返回值，可以是多个，也可以没有");
        return new int[]{1, 2, 3};
    }

    // 返回值多个，用对象
    public static Person print11() {
        System.out.println("方法的返回值，可以是多个，也可以没有");
        return new Person();
    }

    // 返回值多个，用Map
    public static Map print12() {
        System.out.println("方法的返回值，可以是多个，也可以没有");
        return new HashMap<>();
    }
}
