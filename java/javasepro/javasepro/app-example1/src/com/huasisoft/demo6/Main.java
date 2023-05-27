package com.huasisoft.demo6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * 数字加密
 * 需求:
 * 某系统的数字密码:比如1983，采用加密方式进行传输，规则如下:先得到每位数，然后每位数都加上
 * 5，再对10求余，最后将所有数字反转，得到一串新数。
 * 例如:1983加密后得到：8346
 */
public class Main {
    public static void main(String[] args) {
        int num = 1983;

        String str1 = String.valueOf(num);
        int[] tmp1 = new int[str1.length()];
        for (int i = 0; i < tmp1.length; i++) {
            char c = str1.charAt(i);
            tmp1[i] = c - 48; // 将字符转为数字
        }

        System.out.println("数字转数组后：" + Arrays.toString(tmp1));
        System.out.println("数字转数组后：" + Arrays.toString(intToArray(num)));


        String str;

        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("请输入一个数字：");
            // 判断输入的是否为数字
            str = sc.next();

            if (Objects.equals(str, "exit")) {
                break;
            }

            System.out.println("输入的字符是：" + str);

            int[] tmp = new int[str.length()];
            for (int i = 0; i < tmp.length; i++) {
                char c = str.charAt(i);
                System.out.println(getType(c) + " " + c + " " + (int) c);
                // 48是字符0的ASCII码，57是字符9的ASCII码
                if (c < 48 || c > 57) { // 运算时，字符会自动转为ASCII码
                    System.out.println("输入的不是数字，请重新输入！");
                    continue OUT;
                }
                tmp[i] = c - 48; // 将字符转为数字
            }

            num = arrayToInt(tmp);
            System.out.println("输入的数字：" + num);
            if (num <= 0) {
                // 跳出本次循环，进入下一次循环
                System.out.println("输入的数字不能为0，请重新输入！");
                continue;
            }

            System.out.println("加密后的数字：" + encryption(num) + "\n");
        }
    }

    // 数字加密
    public static int encryption(int num) {
        int[] tmp = intToArray(num);
        System.out.println("数字转数组后：" + Arrays.toString(tmp));

        int[] nums = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            nums[i] = (tmp[i] + 5) % 10;
        }
        System.out.println("每位加5%10后的结果：" + Arrays.toString(nums));

        // 反转数组
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }

        // 数组反转方案2
        // int[] result = new int[nums.length];
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     result[nums.length - 1 - i] = nums[i];
        // }

        // 反转方案3
        System.out.println("反转2-前" + Arrays.toString(nums));
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) { // i从前往后，j从后往前，循环次数为数组长度的一半
            System.out.println("i=" + i + " j=" + j);
            int tmp1 = nums[j]; // 保存数组最后一个元素
            nums[j] = nums[i];  // 将数组第一个元素赋值给数组最后一个元素
            nums[i] = tmp1;   // 将保存的数组最后一个元素赋值给数组第一个元素
        }
        System.out.println("反转2-后" + Arrays.toString(nums));

        System.out.println("加密后的数组：" + Arrays.toString(result));

        // 将数组转为数字
        return arrayToInt(result);
    }

    // 获取对象的类型
    public static String getType(Object o) {
        return o.getClass().toString();
    }

    // 将数字转为数组
    public static int[] intToArray(int num) {
        // 1、先将数字转为字符串
        String str = String.valueOf(num);
        // 2、创建一个数组，长度为字符串的长度
        int[] tmp = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // charAt()方法返回字符串中指定索引处的字符
            // 3、将字符串中的每个字符转为数字
            // 3.1、先得到每个字符
            char c = str.charAt(i);
            // System.out.println(getType(c) + " " + c);
            // 3.2、将字符转为字符串
            String s = String.valueOf(c);
            // 3.3、再将字符串转为数字
            int n = Integer.parseInt(s);
            // 4、将数字存入数组
            tmp[i] = n;

            // 也可以直接一行代码实现
            // tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

            // 也可以直接一行代码实现
            // tmp[i] = str.charAt(i) - 48;
        }
        return tmp;
    }

    // 数组转数字
    public static int arrayToInt(int[] nums) {
        int n = 0;
        for (int j : nums) {
            n = n * 10 + j;
        }
        return n;
    }
}