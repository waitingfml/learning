package com.huasisoft.demo4;

import java.util.Arrays;

/**
 * 数组元素复制
 * 需求:
 * 把一个数组中的元素复制到另一个新数组中去。
 * 分析:
 * 需要动态初始化一个数组，长度与原数组一样。
 * 遍历原数组的每个元素，依次赋值给新数组。
 * 输出两个数组的内容。
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        // System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
