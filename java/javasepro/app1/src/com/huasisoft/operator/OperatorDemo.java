package com.huasisoft.operator;


/**
 * 操作符
 */
public class OperatorDemo {
    public static void main(String[] args) {
        // 算术运算符
        int a = 10;
        int b = 3;
        System.out.println("算术运算符");
        System.out.println(a + b); // 13

        // 自增自减运算符
        int c = 10;
        int d = c++; // 先赋值再自增
        System.out.println("先赋值再自增");
        System.out.println(d); // 10
        System.out.println(c); // 11

        int e = 10;
        int f = ++e; // 先自增再赋值
        System.out.println("先自增再赋值");
        System.out.println(e); // 11
        System.out.println(f); // 11

        // 关系运算符
        int g = 10;
        int h = 20;
        System.out.println("关系运算符");
        System.out.println(g == h); // false
        System.out.println(g != h); // true
        System.out.println(g > h); // false
        System.out.println(g < h); // true
        System.out.println(g >= h); // false
        System.out.println(g <= h); // true

        // 逻辑运算符
        boolean i = true;
        boolean j = false;
        System.out.println("逻辑运算符");
        System.out.println(i && j); // false
        System.out.println(i || j); // true
        System.out.println(!i); // false

        // 位运算符 & | ^ ~ << >> >>>
        int k = 10; // 1010
        int l = 20; // 10100
        System.out.println("位运算符");
        System.out.println(k & l); // 0 00000
        System.out.println(k | l); // 30
        System.out.println(k ^ l); // 30
        System.out.println(~k); // -11
        System.out.println(k << 2); // 40 101000
        System.out.println(k >> 2); // 2 10
        System.out.println(k >>> 2); // 2 10


        // 赋值运算符
        int m = 10;
        int n = 20;
        System.out.println("赋值运算符");
        System.out.println(m += n); // 30 说明：m = 10 + 20 = 30
        System.out.println(m -= n); // 10 说明：m = 30 - 20 = 10
        System.out.println(m *= n); // 200 说明：m = 10 * 20 = 200
        System.out.println(m /= n); // 10 说明：m = 200 / 20 = 10
        System.out.println(m %= n); // 10 说明：m = 10 % 20 = 10
        System.out.println(m &= n); // 0 说明：m = 10 & 20 = 0
        System.out.println(m |= n); // 20 说明：m = 10 | 20 = 30 | 20 = 20
        System.out.println(m ^= n); // 0 说明：m = 20 ^ 20 = 0
        System.out.println(m <<= n); // 0 说明：m = 0 << 20 = 0
        System.out.println(m >>= n); // 0 说明：m = 0 >> 20 = 0
        System.out.println(m >>>= n); // 0 说明：m = 0 >>> 20 = 0

        // 三元运算符
        int o = 10;
        int p = 20;
        int q = o > p ? o : p;
        System.out.println("三元运算符");
        System.out.println(q); // 20

        // instanceof 运算符
        String r = "hello";
        System.out.println("instanceof 运算符");
        System.out.println(r instanceof String); // true

        // 运算符优先级
        System.out.println("运算符优先级");
        System.out.println(3 + 4 * 5); // 23
        System.out.println((3 + 4) * 5); // 35

        // 运算符结合性
        System.out.println("运算符结合性");
        System.out.println(3 + 4 + 5); // 12
        System.out.println(3 + (4 + 5)); // 12

        // 运算符的短路
        System.out.println("运算符的短路");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false











    }
}
