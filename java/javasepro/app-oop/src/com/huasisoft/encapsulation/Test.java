package com.huasisoft.encapsulation;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.setName("张三");
        System.out.println(student.age);
        System.out.println(student.getName());


        Student student2 = new Student("李四", 20);
        System.out.println(student2.age);
        System.out.println(student2.getName());

        int a;
        // System.out.println(a); // 报错，局部变量没有默认值




    }
}
