package com.huasisoft.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 两个数组变量指向同一个数组对象
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);

        arr2[0] = 100;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
