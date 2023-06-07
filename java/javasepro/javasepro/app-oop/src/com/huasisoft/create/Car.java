package com.huasisoft.create;

public class Car {
    String name; // 名称
    String color; // 颜色
    int maxSpeed; // 最高时速
    double price; // 价格

    public static void main(String[] args) {

    }

    public void run() {
        System.out.println("Running...");
    }

    public void stop() {
        System.out.println("Stopped!");
    }

    public void info() {
        System.out.println("名称：" + name + "\n颜色：" + color + "\n最高时速：" + maxSpeed + "\n价格：" + price);
    }
}
