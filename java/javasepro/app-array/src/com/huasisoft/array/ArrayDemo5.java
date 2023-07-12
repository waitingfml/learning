package com.huasisoft.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 数组元素随机打乱
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
