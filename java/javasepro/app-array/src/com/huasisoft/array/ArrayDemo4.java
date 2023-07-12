package com.huasisoft.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 数组求和
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int number : numbers) {
            sum += number; // sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
