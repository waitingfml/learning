package com.huasisoft.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        // 定一个map集合
        Map<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "xxx");
        map.put("sex", "男");

        System.out.println(map);

        // 定义一个ArrayList集合
        ArrayList<Map<String,String>> list = new ArrayList<>();

        list.add(map);
        list.add(map);
        list.add(map);

        System.out.println(list);

        // 遍历集合
        for (Map<String, String> stringStringMap : list) {
            System.out.println(stringStringMap.get("name"));
        }
    }
}
