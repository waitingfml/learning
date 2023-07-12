package com.huasisoft.create;


/**
 * 1类和对象是什么?
 * 类:是共同特征的描述(设计图);对象:是真实存在的具体实例。
 * <p>
 * 2.如何设计类?
 * public class 类名 {
 * 1、成员变量(代表属性的,一般是名词)
 * 2、成员方法(代表行为的，一般是动词)
 * <p>
 * 3.如何创建对象?
 * 类名对象名=new类名();
 * <p>
 * 4.拿到对象后怎么访问对象的信息?
 * 对象.成员变量;
 * 对象.成员方法(..)
 */

public class Demo1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.color = "black";
        car.maxSpeed = 200;
        car.price = 200000;

        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.maxSpeed);

        car.run();
        car.stop();
        car.info();

        System.out.println("----------");
        Car car2 = new Car();
        car2.name = "Benz";
        car2.color = "white";
        car2.maxSpeed = 180;
        car2.price = 180000;

        car.run();
        car.stop();
        car2.info();
    }
}
