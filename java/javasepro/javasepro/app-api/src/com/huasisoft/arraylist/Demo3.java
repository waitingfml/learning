package com.huasisoft.arraylist;

import com.huasisoft.create.Student;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        // 定一个学生列表
        ArrayList<Student> list = new ArrayList<>();

        Student student = new Student();
        student.name = "张三";
        student.age = 18;

        list.add(student);

        Student student2 = new Student();
        student2.name = "李四";
        student2.age = 20;
        list.add(student2);

        System.out.println(list);

        list.forEach(s -> {
            System.out.println(s);
            System.out.println(s.name);
            System.out.println(s.age);
        });

    }
}
