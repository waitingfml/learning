package com.huasisoft.array;

import java.util.Scanner;

public class ArrayGameGuessTheNumber {
    public static void main(String[] args) {
        // 游戏：猜数字
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int guess = input.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("太大了，请重新输入：");
            } else {
                System.out.println("太小了，请重新输入：");
            }
            guess = input.nextInt();
        }

        System.out.println("恭喜你，猜对了！");
        input.close();

        // 循环嵌套，打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }

        // 循环嵌套，跳出循环
        int i = 1;
        OUT:
        while (i <= 100) {
            System.out.println("while " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("for " + j);
                if (j == 2) {
                    break OUT;
                }
            }
            i++;
        }
    }
}
