package com.huasisoft.demo;


import java.util.Arrays;

/**
 * 购物车
 */
public class ShopCar {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.id = 1;
        goods.name = "电脑";
        goods.price = 1000;
        goods.count = 1;

        Goods goods2 = new Goods();
        goods2.id = 2;
        goods2.name = "手机";
        goods2.price = 2000;
        goods2.count = 2;

        Goods goods3 = new Goods();
        goods3.id = 3;
        goods3.name = "电视";
        goods3.price = 3000;
        goods3.count = 3;

        Goods[] goodsArray = new Goods[3];
        goodsArray[0] = goods;
        goodsArray[1] = goods2;
        goodsArray[2] = goods3;

        double totalPrice = 0;

        for (Goods g : goodsArray) {
            System.out.println();
            totalPrice += g.price * g.count;
        }

        System.out.println("总价：" + totalPrice);
    }
}
