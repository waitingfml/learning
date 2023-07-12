package com.huasisoft.d1_extends;

public class Demo2 {
    public static void main(String[] args) {
        // 继承后:成员变量、成员方法的访问特点
        D d = new D();
        System.out.println(d.name);
        // d.show();
        d.test();
    }
}


class C {
    public String name;

    public void show() {
        System.out.println("A show");
    }
}

class D extends C {
    // 方法重写:子类中出现了和父类一模一样的方法

    @Override // 注解:用来检测方法是否是重写的方法
    public void show() {
        System.out.println("D show");
    }

    // 方法重载:在同一个类中，出现了方法名相同，参数列表不同的方法
    public void show(String a) {
        System.out.println("D show2");
    }

    public void show(int a) {
        System.out.println("D show3");
    }

    public void show(int a, String b) {
        System.out.println("D show3");
    }

    public void show(String a, int b) {
        System.out.println("D show3");
    }

    public void test() {
        show(); // 默认调用的是本类中的show方法
        super.show(); // 调用父类中的show方法
        this.show(); // 调用本类中的show方法
    }
}