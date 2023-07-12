package com.huasisoft.returns;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println(mul(0, 2));
        System.out.println(mul(1, 2));
    }


    // return 乘法
    public static int mul(int a, int b) {
        if(a == 0){
            System.err.println("a不能为0");
            return  0;
        }
        return a * b;
    }
}
