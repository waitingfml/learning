package com.huasisoft.demo1;


import java.util.Scanner;

/**
 *  案例1
 *  买飞机票
 *  需求:
 *  机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
 *  机票最终优惠价格的计算方案如下:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
 *  分析:
 *  键盘录入机票的原价，仓位类型，月份信息，调用方法返回机票最终的优惠价格。
 *  方法内部应该先使用if分支判断月份是是旺季还是淡季，然后使用switch分支判断是头等舱还是经济舱。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price = sc.nextDouble();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入仓位类型:");
        String type = sc.next();
        double result = getPrice(price, month, type);
        System.out.println(result);
    }

    public static double getPrice(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱" -> {
                    return price * 0.9;
                }
                case "经济舱" -> {
                    return price * 0.85;
                }
                default -> System.out.println("仓位类型输入错误");
            }
        } else if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {

            switch (type) {
                case "头等舱" -> {
                    return price * 0.7;
                }
                case "经济舱" -> {
                    return price * 0.65;
                }
                default -> System.out.println("仓位类型输入错误");
            }
        } else {
            System.out.println("月份输入错误");
        }
        return price;
    }


}
