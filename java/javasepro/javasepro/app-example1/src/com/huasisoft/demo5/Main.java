package com.huasisoft.demo5;

import java.util.Scanner;

/**
 * 评委打分案例
 * 需求:
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为:去掉最
 * 高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
 * 分析:
 * 1、把6个评委的分数录入到程序中去---->使用数组
 *   int[] scores = new int[6];
 * 2、遍历数组中每个数据，进行累加求和，并找出最高分、最低分。
 * 3、按照分数的计算规则算出平均分。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getPackage().getName());

        // 1、定义一个数组，用来存储6个评委的分数
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数:");
            scores[i] = sc.nextInt();
        }
        // 2、遍历数组中每个数据，进行累加求和，并找出最高分、最低分。
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        // 3、按照分数的计算规则算出平均分。
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("选手的最后得分为:" + avg);
    }
}
