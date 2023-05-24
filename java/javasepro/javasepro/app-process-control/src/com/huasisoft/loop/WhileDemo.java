package com.huasisoft.loop;

public class WhileDemo {
    public static void main(String[] args) {
        // while循环格式
        // while(条件表达式){
        //     循环体
        //     迭代语句
        // }
        // 执行流程
        // 1.计算条件表达式的值
        // 2.如果为true，执行循环体
        // 3.执行完循环体，再次计算条件表达式的值
        // 4.如果为true，执行循环体
        // 5.执行完循环体，再次计算条件表达式的值
        // 6.如果为false，循环结束

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        // 什么时候用while循环，什么时候用for循环
        // 如果循环次数确定，用for循环
        // 如果循环次数不确定，用while循环


        WhileDemo.sum();
        WhileDemo.evenSum();
        WhileDemo.oddSum();
        WhileDemo.evenCount();
        WhileDemo.oddCount();
        WhileDemo.evenAndOddSum();

    }


    // 案例
    // 1.求1-100之间的和
    public static void sum() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    // 2.求1-100之间的偶数和
    public static void evenSum() {
        int i = 2;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i+=2;
        }
        System.out.println(sum);
    }

    // 3.求1-100之间的奇数和
    public static void oddSum() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i+=2;
        }
        System.out.println(sum);
    }

    // 4.求1-100之间的偶数个数
    public static void evenCount() {
        int i = 2;
        int count = 0;
        while (i <= 100) {
            count++;
            i += 2;
        }
        System.out.println(count);
    }

    // 5.求1-100之间的奇数个数
    public static void oddCount() {
        int i = 1;
        int count = 0;
        while (i <= 100) {
            count++;
            i += 2;
        }
        System.out.println(count);
    }

    // 6.求1-100之间的偶数和奇数和
    public static void evenAndOddSum() {
        int i = 1;
        int evenSum = 0;
        int oddSum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        }
        System.out.println("偶数和：" + evenSum);
        System.out.println("奇数和：" + oddSum);
    }
}
