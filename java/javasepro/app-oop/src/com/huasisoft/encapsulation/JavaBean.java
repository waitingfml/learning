package com.huasisoft.encapsulation;


/**
 * JavaBean 是一种Java语言写成的可重用组件。
 * 所谓JavaBean，是指符合如下标准的Java类：
 * 1.类是公共的
 * 2.必须有一个无参的公共的构造器,有参数构造器是可写可不写的
 * 3.有属性，且有对应的get、set方法
 * 4.成员变量使用private修饰
 * 5.提供成员变量对应的setXxx()/getXxx()方法。
 */
public class JavaBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JavaBean(String name) {
        this.name = name;
    }

    public JavaBean() {
    }
}
