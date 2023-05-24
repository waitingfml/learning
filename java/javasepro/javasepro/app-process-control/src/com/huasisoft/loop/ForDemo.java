package com.huasisoft.loop;

public class ForDemo {
    public static void main(String[] args) {
        // 循环结构for
        // for(初始化语句;条件判断语句;条件控制语句) {
        //     循环体语句;
        // }
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        ForDemo.forTest();
        ForDemo.forTest2();
    }


    public static void forTest() {
        // for 求 1- 10 奇数的和
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void forTest2() {
        System.out.println("水仙花数：------------------------------");
        // 使用for找出水仙花数并输出
        // 什么是水仙花数？
        // 1.三位数
        // 2.每个位上的数字的立方和等于它本身
        // 例如：153 = 1*1*1 + 5*5*5 + 3*3*3
        for (int i = 100; i < 999; i++) {
            // 判断三位数是否满足要求
            // 1.获取个位数
            int ge = i % 10;
            // 2.获取十位数
            int shi = i / 10 % 10;
            // 3.获取百位数
            int bai = i / 100;
            // 4.判断是否满足要求
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }
    }
}
