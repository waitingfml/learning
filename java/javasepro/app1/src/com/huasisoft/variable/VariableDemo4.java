package com.huasisoft.variable;

public class VariableDemo4 {
    public static void main(String[] args) {
        //== 数据类型转换
        // 自动类型转换
        // byte,short,char -> int -> long -> float -> double
        byte b = 10;
        short c = 10;
        int f = 10;
        long e = 10L;
        int i;
        i = b;
        f = c;
        e = f;

        String str = "hello";
        // str = b; // 编译错误，不能将byte类型的值赋值给String类型的变量
        System.out.println(i);
        System.out.println(c);
        System.out.println(f);
        System.out.println(e);
        System.out.println(str);

        // 强制类型转换
        // double -> float -> long -> int -> char -> short -> byte
        double d = 3.1415926;
        int i2 = (int)d;

        System.out.println(i2);


        // 强制类型转换的注意事项
        // 1.强制类型转换，可能导致精度丢失
        int i3 = 128;
        byte b2 = (byte)i3;
        System.out.println(b2);

        // 2.强制类型转换，可能会发生数据溢出
        int i4 = 2147483647;
        int i5 = 1;
        int i6 = i4 + i5;
        System.out.println(i6);

        // 3.强制类型转换，可能会发生数据溢出
        int i7 = 2147483647;
        long l = 1L;
        int i8 = (int)(i7 + l);
        System.out.println(i8);





    }
}
