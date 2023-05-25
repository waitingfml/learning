package com.huasisoft.create;

public class Demo6 {
    public static void main(String[] args) {
        // 方法调用内存分析
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));

    }

    // 找出数组中最大值
    public static int max(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
