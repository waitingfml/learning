package com.huasisoft.d1_static;

public class User {
    // 在线人数
    public static int onlineCount = 0;

    private String name;
    private int age;


    public static void main(String[] args) {
        System.out.println("main");
        User u = new User();
        u.name = "张三";
        u.age = 18;
        System.out.println(u.name);
        System.out.println(u.age);

        u.onlineCount = 100;

        System.out.println(User.onlineCount);

        User u2 = new User();

        System.out.println(u2.onlineCount);


    }



    public static void test() {
        System.out.println("test");
    }
}
