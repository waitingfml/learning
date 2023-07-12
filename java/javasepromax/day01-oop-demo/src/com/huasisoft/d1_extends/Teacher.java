package com.huasisoft.d1_extends;

public class Teacher extends People{

    private String departmentName; // 部门名称

    public Teacher() {
        System.out.println("Teacher 无参构造器");
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;

    }

    public String getDepartmentName() {
        return departmentName;
    }

    // 发布问题
    public void publishQuestion() {
    }
}
