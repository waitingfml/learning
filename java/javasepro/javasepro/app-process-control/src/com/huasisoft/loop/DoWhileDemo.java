package com.huasisoft.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        // do while 循环
        // 格式：
        // do {
        //    //代码语句
        // }while(布尔表达式);
        // 与 while 语句相比，do while 语句的区别是，do while 语句至少会执行一次。
        // 先执行一次循环体，再判断条件是否成立，如果成立，再继续执行循环体，否则循环结束

        int x = 10;
        do {
            System.out.println("value of x : " + x);
            x++;
        } while (x < 20);

        DoWhileDemo.sum();
        DoWhileDemo.evenSum();
        DoWhileDemo.oddSum();
        DoWhileDemo.evenCount();
        DoWhileDemo.oddCount();
        DoWhileDemo.evenAndOddSum();
    }

    // 案例
    // 1.求1-100之间的和
    public static void sum() {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println(sum);
    }

    // 2.求1-100之间的偶数和
    public static void evenSum() {
        int i = 2;
        int sum = 0;
        do {
            sum += i;
            i+=2;
        } while (i <= 100);
        System.out.println(sum);
    }

    // 3.求1-100之间的奇数和
    public static void oddSum() {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i+=2;
        } while (i <= 100);
        System.out.println(sum);
    }

    // 4.求1-100之间的偶数个数
    public static void evenCount() {
        int i = 2;
        int count = 0;
        do {
            count++;
            i+=2;
        } while (i <= 100);
        System.out.println(count);
    }

    // 5.求1-100之间的奇数个数
    public static void oddCount() {
        int i = 1;
        int count = 0;
        do {
            count++;
            i+=2;
        } while (i <= 100);
        System.out.println(count);
    }

    // 6.求1-100之间的偶数和与奇数和
    public static void evenAndOddSum() {
        int i = 1;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        } while (i <= 100);
        System.out.println("偶数和：" + evenSum);
        System.out.println("奇数和：" + oddSum);
    }
}
