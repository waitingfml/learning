package com.huasisoft.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // Java 内存分配，数组的内存分配是在运行时进行的

        // Java 内存分配介绍
        // 1.栈内存：存放局部变量，方法的参数，对象的引用变量
        // ==》方法运行时所进入的内存，变量也在这里
        // ==》栈内存是线程私有的

        // 2.堆内存：存放对象实例和数组
        // ==》new 关键字创建的对象和数组所进入的内存
        // ==》new 出来了的东西会在这块内存中开辟空间并产生地址

        // 3.方法区：存放类的信息，常量，静态变量，编译器编译后的代码等
        // ==》字节码文件加载时进入的内存（xxx.class）
        // ==》方法区和堆内存是线程共享的

        // 4.本地方法区：与操作系统相关的信息（）
        // 5.寄存器：CPU使用的内存（）

        int a = 10; // 基本类型的变量，存放在栈内存中
        System.out.println(a);

        int[] arr = new int[]{1, 2, 3}; // 引用类型的变量，存放在栈内存中，数组对象存放在堆内存中
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
