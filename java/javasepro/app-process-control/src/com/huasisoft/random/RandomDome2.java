package com.huasisoft.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDome2 {
    public static void main(String[] args) {
        // 随机一个幸运号码200-500之间
        int luckyNumber = new Random().nextInt(500 - 200 + 1) + 200;
        System.out.println("幸运号码是：" + luckyNumber);

        // 使用一个死循环让用户输入幸运号码，直到用户输入的幸运号码和随机生成的幸运号码相等
        while (true) {
            // 1.提示用户输入幸运号码
            System.out.println("请输入幸运号码：");
            // 2.接收用户输入的幸运号码
            int inputNumber = new Scanner(System.in).nextInt();
            // 3.判断用户输入的幸运号码和随机生成的幸运号码是否相等
            if (inputNumber == luckyNumber) {
                System.out.println("恭喜你，中奖了！");
                break;
            } else {
                System.out.println("很遗憾，没有中奖！");
            }
        }
    }
}
