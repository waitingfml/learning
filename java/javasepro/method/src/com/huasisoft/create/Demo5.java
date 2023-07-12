package com.huasisoft.create;

public class Demo5 {
    public static void main(String[] args) {
        // 找出数组中最大值
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(max(arr));

        // 找出数组中最大值
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(max(arr2));

        // 找出数组中最大值
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(max(arr3));

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
