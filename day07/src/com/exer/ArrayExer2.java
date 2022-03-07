package com.exer;

public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        // 显示arr1
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

        // 赋值arr2变量等于arr1
        arr2 = arr1;

        // 修改arr2中偶索引元素，使其等于索引值
        for (int i = 0;i < arr2.length;i++){
            if ( i % 2 == 0){
                arr2[i] = i;
            }
        }

        System.out.println();
        // 打印arr1
        for (int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
