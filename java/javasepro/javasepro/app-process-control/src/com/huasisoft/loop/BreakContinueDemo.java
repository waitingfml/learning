package com.huasisoft.loop;

public class BreakContinueDemo {
    public static void main(String[] args) {
        // break 和 continue 区别
        // break 用于结束整个循环
        // continue 用于结束本次循环，继续下一次循环
        // break 和 continue 用于循环结构中

        // break 和 continue 用法
        // break 示例
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < intArray.length; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("break:" + intArray[i]);
        }
        // continue 示例
        for (int i = 0; i < intArray.length; i++) {
            if (i == 5) {
                System.out.println(5);
                continue;
            }
            System.out.println("continue:" + intArray[i]);
        }

    }
}
