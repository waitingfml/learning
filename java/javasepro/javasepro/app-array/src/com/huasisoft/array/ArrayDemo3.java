package com.huasisoft.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // String 数组 静态初始化
        System.out.println("String 数组 静态初始化");
        String[] names = {"James", "Larry", "Tom", "Lacy" };
        System.out.println(names.length);
        System.out.println(names[1]);
        names[1] = "Larry2";
        System.out.println(names[1]);

        // String 数组 动态初始化 默认值是null
        System.out.println("String 数组 动态初始化");
        String[] names2 = new String[100];
        System.out.println(names2.length);
        names2[1] = "Larry";
        System.out.println(names2[1]);

        // int 数组 静态初始化 默认值是0
        System.out.println("int 数组");
        int[] numbers = new int[10];
        numbers[0] = 100;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // double 数组 动态初始化 默认值是0.0
        System.out.println("double 数组");
        double[] myList = new double[10];
        myList[0] = 5.6;
        System.out.println(myList[0]);
        System.out.println(myList[1]);

        // float 数组 动态初始化 默认值是0.0
        System.out.println("float 数组");
        float[] myList2 = new float[10];
        myList2[0] = 5.6f;
        System.out.println(myList2[0]);
        System.out.println(myList2[1]);

        // char 数组
        System.out.println("char 数组");
        char[] charArray = {'a', 'b', 'c', 'd'};
        System.out.println((int)charArray[0]);
        System.out.println(charArray[1]);

        // char 数组 动态初始化 默认值是null
        System.out.println("char 数组 动态初始化");
        char[] charArray2 = new char[10];
        charArray2[0] = 'a';
        System.out.println((int)charArray2[0]);
        System.out.println((int)charArray2[1]);
        System.out.println(charArray2[1]);


        // boolean 数组 默认值是false
        System.out.println("boolean 数组");
        boolean[] booleanArray = new boolean[10];
        booleanArray[0] = true;
        System.out.println(booleanArray[0]);
        System.out.println(booleanArray[1]);
        System.out.println(booleanArray[2]);


    }
}
