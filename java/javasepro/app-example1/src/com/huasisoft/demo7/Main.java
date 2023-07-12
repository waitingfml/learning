package com.huasisoft.demo7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 双色球
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = generate();
        System.out.println("双色球：" + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " " + arr[6]);


        while (true) {
            // 用户输入的号码
            int[] input = input();

            // 判断是否中奖
            String flag = winTheLottery(arr, input);
            System.out.println("是否中奖：" + flag);
        }
    }

    // 判断是否中奖
    public static String winTheLottery(int[] arr, int[] input) {
        // 判断红球中奖个数
        int redBall = 0;
        for (int j = 0; j < 6; j++) { // 用户输入的号码
            for (int i = 0; i < 6; i++) { // 中奖号码
                if (arr[j] == input[i]) {
                    redBall++;
                }
            }
        }

        System.out.println("红球中奖个数" + redBall);

        // 判断蓝色球中奖个数
        int blueBall = arr[arr.length - 1] == input[input.length - 1] ? 1 : 0;
        System.out.println("篮球中奖个数" + blueBall);

        /*
            一等奖
            当奖池资金低于1亿元时，一等奖奖金总额为当期高奖级奖金的75%与奖池中累积的资金之和，单注奖金按注均分，单注最高限额封顶500万元。当奖池资金高于1亿元（含）时，一等奖奖金总额包括两部分，一部分为当期高奖级奖金的55%与奖池中累积的资金之和，单注奖金按注均分，单注最高限额封顶500万元；另一部分为当期高奖级奖金的20%，单注奖金按注均分，单注最高限额封顶500万元。
            选6+1中6+1
            二等奖
            二等奖奖金总额为当期高奖级奖金的25%，单注奖金按注均分，单注最高限额封顶500万元。
            选6+0中6+0
            三等奖
            单注奖金额固定为3000元
            选5+1中5+1
            四等奖
            单注奖金额固定为200元
            选5+0中5+0或4+1中4+1
            五等奖
            单注奖金额固定为10元
            选4+0中4+0或中3+1
            六等奖
            单注奖金额固定为5元
            选2+1中2+1或1+1中1+1或0+1中0+1
         */

        String str;
        // 6个奖项判断
        if (blueBall == 1 && redBall == 6) {
            str = "一等奖";

        } else if (redBall == 6) {
            str = "二等奖";

        } else if (blueBall == 1 && redBall == 5) {
            str = "三等奖";

        } else if (redBall == 5 || blueBall == 1 && redBall == 4) { // 5+0中5+0或4+1中4+1
            str = "四等奖";

        } else if (redBall == 4 || blueBall == 1 && redBall == 3) { // 选4+0中4+0或中3+1
            str = "五等奖";

        } else if (blueBall == 1 && redBall < 3) { // 选2+1中2+1或1+1中1+1或0+1中0+1
            str = "六等奖";

        } else {
            str = "未中奖";

        }

        System.out.println(str);
        return str;
    }

    // 用户输入号码
    public static int[] input() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码：");
            arr[i] = sc.nextInt();
        }

        System.out.println("用户输入的号码：" + Arrays.toString(arr));
        return arr;
    }

    // 生成一组双色球
    public static int[] generate() {
        int[] arr = new int[7];
        int[] redBall = generateRedBall();
        for (int i = 0; i < redBall.length; i++) {
            arr[i] = redBall[i];
        }
        arr[arr.length - 1] = generateBlueBall();
        return arr;
    }

    // 生成红球 1-32
    public static int[] generateRedBall() {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) { // 生成6个红球

            // 判断红球是否重复
            while (true) {
                int redBall = random.nextInt(33) + 1; // [0,32] + 1 = [1,33]
                boolean flag = false; // 默认没有有重复

                for (int j = 0; j < i; j++) {
                    if (arr[j] == redBall) {
                        flag = true; // 有重复
                        break;
                    }
                }

                if (!flag) { // 没有重复
                    arr[i] = redBall;
                    break;
                }
            }
        }
        sort(arr); // 排序
        System.out.println("红球" + Arrays.toString(arr));
        // 返回排序后的数组
        return sort(arr);
    }

    // 生成蓝色球 1-16
    public static int generateBlueBall() {
        Random random = new Random();
        return random.nextInt(16) + 1; //  [0,15] + 1 = [1,16]
    }

    // 数组排序
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // 交换位置
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
