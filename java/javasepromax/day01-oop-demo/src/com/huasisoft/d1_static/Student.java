package com.huasisoft.d1_static;

public class Student {
    // 静态变量
    public static String schoolName = "北京大学";
    // 成员变量
    public String name;
    public int age;

    public static void main(String[] args) {
        showSchoolName();
    }

    // 静态方法
    public static void showSchoolName() {
        System.out.println("学校名称：" + schoolName);
        // System.out.println(this.age); // 无法从 static 上下文引用非 static 变量 'age'
        // showStudentInfo(); // 无法从 static 上下文引用非 static 方法 'showStudentInfo()'
    }

    // 成员方法
    public void showStudentInfo() {
        System.out.println("学生姓名：" + name + "，年龄：" + age);
    }
}
