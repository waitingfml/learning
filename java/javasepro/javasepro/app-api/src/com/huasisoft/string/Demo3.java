package com.huasisoft.string;

public class Demo3 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "张三";

        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.startsWith("he"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.contains("ll")); // contains比较的是内容
        System.out.println(str.equals("l") + "equals"); // equals比较的是内容,区分大小写
        System.out.println(str.equals("hello") + "equals"); // equals比较的是内容,区分大小写
        System.out.println(str.indexOf("l"));

        System.out.println(str2.charAt(0));
        System.out.println(str2.length());

    }
}
