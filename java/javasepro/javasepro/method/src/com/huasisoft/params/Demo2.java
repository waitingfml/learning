package com.huasisoft.params;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5});
    }

    // 输出数组中的元素
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
