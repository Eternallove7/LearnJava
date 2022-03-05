package com.数组;

/*
*   数组元素是整形：0
*   数组元素是浮点型：0.0
*   数组元素是char型：0(ASCII值)
*   数组元素是boolean型：false
*
*   数组元素是引用数据类型：null
*
* */

public class ArrayTest1 {
    public static void main(String[] args) {
        // 5.数组元素的默认初始化值
        int[] arr = new int[5];
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("*****************************");

        short[] arr1 = new short[5];
        for(int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("*****************************");

        float[] arr2 = new float[5];
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
        System.out.println("*****************************");

        char[] arr3 = new char[5];
        for(int i = 0;i < arr3.length;i++){
            System.out.println(arr3[i]);
        }
        System.out.println("*****************************");

        boolean[] arr4 = new boolean[5];
        for(int i = 0;i < arr4.length;i++){
            System.out.println(arr4[i]);
        }
        System.out.println("*****************************");

        String[] arr5 = new String[5];
        for(int i = 0;i < arr5.length;i++){
            System.out.println(arr5[i]);
        }
        System.out.println("*****************************");

    }
}
