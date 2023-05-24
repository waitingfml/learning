package com.huasisoft.random;

import java.util.Random;

public class RandomDome {
    public static void main(String[] args) {
        // 1.Math.random()方法返回一个[0.0 , 1.0)的伪随机double类型的随机数
        // 2.符合在[min,max]范围内的整数
        // int    num = min + (int)(Math.random() * (max-min+1));
        // 3.用nextInt方法生成区间范围内的随机整数
        Random rand = new Random();
        int n1 = rand.nextInt(100);//返回值在范围[0,100) 即[0,99]
        int n2 = rand.nextInt(100) + 1;//[1,100]内的随机整数
        int n3 = rand.nextInt(80) + 10;//[10,89]内的随机整数
        int n4 = rand.nextInt(27) + 82;//[82,108]内的随机整数
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        // 注意rand.nextInt(n)中的参数n代表的是生成随机整数的上边界 [0，n）。
        // 生成[min,max]范围内随机整数的通用公式为：n=rand.nextInt(max-min+1)+min。

        // 创建随机数对象
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            // 生成一个[0,100)之间的随机数
            System.out.println();
            System.out.println(i + 1 + "：" + random.nextInt(100));
        }

        // 生成 3 - 10 之间的随机数
        System.out.println(random.nextInt(10 - 3 + 1) + 3);
    }
}
