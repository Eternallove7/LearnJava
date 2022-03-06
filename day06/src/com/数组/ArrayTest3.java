package com.数组;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];// 4行3列
        System.out.println(arr[0]);// 输出内存地址
        System.out.println(arr[0][0]);// 0
        int[][] arr1 = new int[4][];// 4行未知列
        System.out.println(arr1[1]);// null
    }
}