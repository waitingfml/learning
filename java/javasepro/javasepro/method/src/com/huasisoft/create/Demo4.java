package com.huasisoft.create;

public class Demo4 {
    public static void main(String[] args) {
        // 判断一个整数是奇数还是偶数
        int num = 10;
        isOddOrEven(num);
        isOddOrEven(11);
        isOddOrEven(100);
        // isOddOrEven(101.1);  // 编译错误, 101.1是double类型
        isOddOrEven((int)111.1);
    }

    // 判断一个整数是奇数还是偶数
    public static void isOddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " 偶数");
        } else {
            System.out.println(num + " 奇数");
        }
    }
}
