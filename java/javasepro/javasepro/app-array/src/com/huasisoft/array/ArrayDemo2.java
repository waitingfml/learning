package com.huasisoft.array;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        System.out.println(Arrays.toString(myList));

        // 打印所有数组元素
        for (double v : myList) {
            System.out.println(v + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (double v : myList) {
            total += v;
        }
        System.out.println("Total is " + total);

        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}
