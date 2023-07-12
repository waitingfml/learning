package com.huasisoft.d1_static_util;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] s = {1, 2, 3};
        System.out.println(ArrayUtil.toString(s));

        int[] arr = null;
        int[] arr1 = {};
        System.out.println(ArrayUtil.toString(arr1));
    }
}
