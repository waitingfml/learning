package com.huasisoft.demo2;


/**
 * 找素数
 * Java 笔试题
 * 判断 101-200 之间有多少个素数，并输出所有素数。
 * 素数:如果除了1和它本身以外，不能被其他正整数整除，就叫素数。
 * 分析:
 * 101-200之间的数据可以采用循环依次拿到;每拿到一个数，判断该数是否是素数。
 * 判断规则是:从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true; // 假设是素数

            // 从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。
            for (int j = 2; j <= i / 2; j++) {
                // 如果有数据可以整除它，就不是素数
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }

            // 如果是素数，就打印出来
            if (flag){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数的个数为:" + count);
    }
}
