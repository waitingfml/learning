package com.huasisoft.d1_static;

public class Demo1 {
    public static void main(String[] args) {

        // 通过类名访问静态变量
        System.out.println(User.onlineCount); // 0

        // 通过对象访问静态变量
        // 1. 创建对象
        User u1 = new User();
        // 2. 修改静态变量
        u1.onlineCount = 100;
        // 3. 打印静态变量
        System.out.println(u1.onlineCount); // 300


        User.test();

        u1.test();
    }
}
