package com.huasisoft.note;

/**
注释的使用
1.注释的作用
①解释说明程序，提高程序的可读性
②可以调试程序
③可以帮助生成文档

2.注释的分类
①单行注释
②多行注释
③文档注释
 */
public class NoteDemo {
    // 单行注释
    public static void main(String[] args) {
        /*
        多行注释
         */
        System.out.println("Hello World!");
    }

    /**
     * 文档注释
     * @param a 整数
     * @param b 整数
     * @return a + b 的和
     */
    public int add(int a,int b) {
        return a + b;
    }
}
