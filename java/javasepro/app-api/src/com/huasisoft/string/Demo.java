package com.huasisoft.string;

public class Demo {
    public static void main(String[] args) {
        String s1 = "李明";
        String s2 = "李明";
        System.out.println(s1 == s2); // ==比较的是两个字符串对象的地址是否相同
        System.out.println(s1.equals(s2)); // equals()方法比较的是字符串的内容是否相同

        System.out.println("====================================");


        String s3 = new String("李明");
        String s4 = new String("李明");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println("====================================");

        char[] c1 = {'a','b','c'};
        String s5 = new String(c1);
        String s6 = new String(c1);
        System.out.println(s5 == s6);;
        System.out.println(s5.equals(s6));;
        System.out.println(s5);
        System.out.println(s5.length());
        System.out.println(s5.charAt(0));

        System.out.println("====================================");
        String s7 = "abc";
        String s8 = new String("abc");
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s7 == s8);
    }
}
