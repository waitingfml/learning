package com.huasisoft.params;

public class Demo1 {
    public static void main(String[] args) {
        // 理解Java中的参数传递 - 基本类型 值传递 值是栈内存中的数据值
        int num = 10;
        System.out.println("调用change方法前: " + num);
        change(num);
        System.out.println("调用change方法后: " + num);

        System.out.println("====================================");

        // 理解Java中的参数传递 - 引用类型 值传递 值是堆内存中的地址值
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("调用change方法前: " + arr[0]);
        change(arr);
        System.out.println("调用change方法后: " + arr[0]);

    }

    // 理解Java中的参数传递 - 基本类型 值传递
    public static void change(int num) {
        num = 20;
        System.out.println("change方法中: " + num);
    }

    // 理解Java中的参数传递 - 引用类型 值传递
    public static void change(int[] arr) {
        arr[0] = 20;
        System.out.println("change方法中: " + arr[0]);
    }
}
