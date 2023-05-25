package com.huasisoft.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // 数组注意事项
        // 1.数组的长度一旦确定，就不能修改
        // 2.数组的元素类型必须一致
        // 3.数组的元素可以是任何数据类型，包括基本类型和引用类型
        // 4.数组的元素默认值：整型（0），浮点型（0.0），字符型（\u0000），布尔型（false），引用类型（null）
        // 5.数组的内存分配是在运行时进行的
        // 6.数组的内存分配是在堆内存中进行的
        // 7.数组的内存分配是一次性分配完成的
        // 8.数组的内存分配是一维一维分配的
        // 9.数组的内存分配是线程共享的
        // 10.数组的内存分配是在方法区中进行的
        // 11.数组的内存分配是在栈内存中进行的
        // 12.数组的内存分配是在本地方法区中进行的
        // 13.数组的内存分配是在寄存器中进行的

        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[1]);

        arr = null;
        System.out.println(arr);
        System.out.println(arr.length); // NullPointerException
    }
}
