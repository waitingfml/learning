package com.huasisoft.string;

public class Demo2 {
    public static void main(String[] args) {
        // String 常用api
        String s1 = "wo我❤️中国";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(4));
        System.out.println(s1.charAt(5));
        System.out.println(s1.charAt(6));

        System.out.println("====================================");
        String s2 = "❤️";
        String s3 = "中";
        System.out.println(s2.length());
        System.out.println(s3.length());

        System.out.println("====================================");
        String s4 = "wo我❤️中国";
        System.out.println(s4.indexOf("我"));
        System.out.println(s4.indexOf("❤️"));
        System.out.println(s4.indexOf("中"));
        System.out.println(s4.indexOf("国"));


        System.out.println("====================================");
        String s5 = "wo我❤️中国";
        System.out.println(s5.substring(1));

        char[] c1 = s5.toCharArray();
        System.out.println(c1);
        for (char c : c1) {
            System.out.println(c);
        }


    }
}
