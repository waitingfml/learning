package com.huasisoft.constructor;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.price);
        car.info();

        System.out.println("----------");
        Car car2 = new Car("BMW", "black", 200, 200000);
        System.out.println(car2.name);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.price);

        car2.info();

    }
}
