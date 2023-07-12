package com.huasisoft.d1_static_util;

public class ArrayUtil {


    private ArrayUtil() {
    }

    /**
     * 数组转字符串
     * @param arr 数组
     * @return 字符串
     */
    public static String toString(int[] arr) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s.append(arr[i]);
            } else {
                s.append(arr[i]).append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }
}
