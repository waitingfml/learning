package com.huasisoft.params;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {
        // 比较两个数组是否相等
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr2))); // true 两个数组的值一样
        System.out.println(arr1 == arr2); // false 两个数组的地址不一样
        System.out.println(equals(arr1, arr2));
    }

    // 比较两个数组是否相等
    public static boolean equals(int[] arr1, int[] arr2) {
        // 1. 比较两个数组的长度是否相等
        if (arr1.length != arr2.length) {
            return false;
        }

        // 2. 比较两个数组中的元素是否一一对应相等
        for (int i = 0; i < arr1.length; i++) {
            // 2.1 如果有一个元素不相等, 则返回false
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // 3. 如果两个数组的长度相等, 并且每个元素都相等, 则返回true
        return true;
    }
}
