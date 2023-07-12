package com.huasisoft.arraylist;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // 创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add(0, "李四");
        list.add(0, "王五");
        list.add(0, "赵六");
        list.add(0, "刘七");
        System.out.println(list);
        System.out.println(list.size());


        // 删除元素
        System.out.println("删除元素");
        String remove = list.remove(0);
        boolean remove2 = list.remove("李四");
        System.out.println("被删除的元素是：" + remove);
        System.out.println("被删除的元素是：" + remove2);
        System.out.println(list.get(0));
        System.out.println(list);

        // 修改元素
        System.out.println("修改元素");
        String set = list.set(0, "周飞");
        System.out.println("被修改的元素是：" + set);
        System.out.println(list);

        // 获取元素
        System.out.println("获取元素");
        String s = list.get(0);
        System.out.println(s);

        // 遍历集合
        System.out.println("遍历集合");
        for (String value : list) {
            System.out.println(value);
        }


        // 集合的长度
        System.out.println("集合的长度");
        System.out.println(list.size());

        // 清空集合
        System.out.println("清空集合");
        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        // 判断集合是否为空
        System.out.println("判断集合是否为空");
        System.out.println(list.isEmpty());
        list.add("张三");
        System.out.println(list);

        // 判断集合是否包含某个元素
        System.out.println("判断集合是否包含某个元素");
        System.out.println(list.contains("张三"));
        System.out.println(list.contains("李四"));

        // 获取元素在集合中的索引
        System.out.println("获取元素在集合中的索引");
        System.out.println(list.indexOf("张三"));
        System.out.println(list.indexOf("李四"));
        System.out.println(list.indexOf("王五"));
        System.out.println(list.indexOf("赵六"));
    }
}
