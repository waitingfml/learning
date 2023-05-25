package com.huasisoft.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // 数组排序
        int[] arr = {1, 3, 2, 5, 4};
        System.out.println(Arrays.toString(arr));
        // 冒泡排序
        // 思想：相邻的两个元素进行比较，如果前面的元素大于后面的元素，交换位置

        // 关键步骤分析
        // 第一次比较：arr[0]和arr[1]比较，如果arr[0]>arr[1]，交换位置
        // 第二次比较：arr[1]和arr[2]比较，如果arr[1]>arr[2]，交换位置
        // 第三次比较：arr[2]和arr[3]比较，如果arr[2]>arr[3]，交换位置
        // 第四次比较：arr[3]和arr[4]比较，如果arr[3]>arr[4]，交换位置
        // 第五次比较：arr[4]和arr[5]比较，如果arr[4]>arr[5]，交换位置


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("--------" + i);
            for (int j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("二" + j + "--" + arr[j] + "--" + arr[j + 1]  + "排序前" + Arrays.toString(arr));
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println("排序后" +  Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
        // 选择排序
    }
}
