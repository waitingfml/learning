package com.huasisoft.d1_extends;

/**
 * 需求:
 * 在传智教育的tlias教学资源管理系统中，存在学生、老师角色会进入系统。
 * 分析:
 * 学生信息和行为(名称，年龄，所在班级，查看课表，填写听课反馈)
 * 老师信息和行为(名称，年龄，部门名称，查看课表，发布问题)
 * 定义角色类作为父类包含属性(名称，年龄)，行为(查看课表)
 * 定义子类:学生类包含属性(所在班级)，行为(填写听课反馈)
 * 定义子类:老师类包含属性(部门名称)，行为(发布问题)
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        s.setClassName("JavaEE 32期");
        s.show();
        s.writeFeedback("xxx");

        System.out.println("// ======================================== //");
        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(33);
        t.setDepartmentName("JavaEE");
        t.show();
        t.publishQuestion();
    }
}
