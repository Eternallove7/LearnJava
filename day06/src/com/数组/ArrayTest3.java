package com.数组;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        System.out.println(arr[0]); //内存地址
        System.out.println(arr[0][0]);

        int[][] arr1 = new int[4][];
        System.out.println(arr1[1]); //null,没分配内存地址
    }
}
