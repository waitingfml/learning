package com.huasisoft.params;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(getElement(arr, 2));
        System.out.println(getIndex(arr, 3));
        System.out.println(getIndex(arr, 8));
    }

    // 从数组中根据索引找到对应的元素
    public static int getElement(int[] arr, int index) {
        return arr[index];
    }

    // 从数组中根据元素找到对应的索引
    public static int getIndex(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
