package com.huasisoft.array;

import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {
        // 求数组最大值
        int[] numbers = {10, 90, 30, 40, 50};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) max = number;
        }
        System.out.println(max);

        arraySort();
    }

    // 数组排序
    public static void arraySort() {
        int[] numbers = {10, 90, 30, 40, 50};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 1]);
    }
}
