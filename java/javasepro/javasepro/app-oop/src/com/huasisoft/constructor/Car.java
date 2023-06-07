package com.huasisoft.constructor;

/**
 * 汽车信息
 */
public class Car {
    public String name;
    public String color;
    public int maxSpeed;
    public double price;

    // 构造方法 无参构造方法 有参构造方法 一旦定义了有参构造方法，无参构造方法就必须显示定义
    // 构造器注意事项
    // 1.构造器的方法名必须与类名一致
    // 2.构造器没有返回值，也不需要void
    // 3.构造器不能被static、final、synchronized、abstract、native修饰
    // 4.构造器可以重载
    // 5.构造器可以调用其他构造器，但是必须放在第一行

    public static void main(String[] args) {
    }

    public Car() {
        System.out.println(this);
        System.out.println("调用了无参构造方法");
    }

    public Car(String name, String color, int maxSpeed, double price) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        System.out.println("调用了有参构造方法");
    }

    public void info() {
        System.out.println("名称：" + name + "\n颜色：" + color + "\n最高时速：" + maxSpeed + "\n价格：" + price);
    }
}
