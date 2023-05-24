package com.huasisoft;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        System.out.println("现在时间：" + date);
        System.out.println("时间戳：" + date.getTime());
        // toString()显示当前日期时间
        System.out.println("toString：" + date.toString());
        // 打印年份、月份、日期、小时、分钟、秒钟、毫秒
        System.out.printf("%tY%n", date); // 2014年
        System.out.printf("%tm%n", date); // 07
        System.out.printf("%td%n", date); // 10
        System.out.printf("%te%n", date); // 10
        System.out.printf("%tH%n", date); // 21
        System.out.printf("%tM%n", date); // 56
        System.out.printf("%tS%n", date); // 04
        System.out.printf("%tL%n", date); // 000
        System.out.printf("%tp%n", date); // 下午
        System.out.printf("%tz%n", date); // +0800
        System.out.printf("%tF%n", date); // 2014-07-10
        System.out.printf("%tT%n", date); // 21:56:04
        System.out.printf("%tr%n", date); // 09:56:04 下午
        System.out.printf("%tD%n", date); // 07/10/14
        System.out.printf("%tc%n", date); // Thu Jul 10 21:56:04 CST 2014


        System.out.println("格式化时间：" + sdf.format(date)); // 输出已经格式化的现在时间（24小时制）

        sdf.applyPattern("yyyy");
        System.out.println("年" + sdf.format(date));
        sdf.applyPattern("MM");
        System.out.println("月" + sdf.format(date));
        sdf.applyPattern("dd");
        System.out.println("日" + sdf.format(date));
        sdf.applyPattern("HH");
        System.out.println("时" + sdf.format(date));
        sdf.applyPattern("mm");
        System.out.println("分" + sdf.format(date));
        sdf.applyPattern("ss");
        System.out.println("秒" + sdf.format(date));
        sdf.applyPattern("a");
        System.out.println("a标记：" + sdf.format(date));
        sdf.applyPattern("E");
        System.out.println("星期" + sdf.format(date));
        sdf.applyPattern("F");
        System.out.println("这个月的第几周：" + sdf.format(date));
        sdf.applyPattern("w");
        System.out.println("这个年的第几周：" + sdf.format(date));
        sdf.applyPattern("W");
        System.out.println("这个月的第几周：" + sdf.format(date));
        sdf.applyPattern("D");
        System.out.println("这个年的第几天：" + sdf.format(date));
        sdf.applyPattern("d");
        System.out.println("这个月的第几天：" + sdf.format(date));
        sdf.applyPattern("G");
        System.out.println("这个时代是：" + sdf.format(date));

        sdf.applyPattern("H");
        System.out.println("一天中的第几个小时（0-23）：" + sdf.format(date));


    }
}
