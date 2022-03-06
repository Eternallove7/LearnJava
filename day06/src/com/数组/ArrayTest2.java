package com.数组;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 静态初始化
        int[][] array = new int[][]{{1, 2, 3}, {2, 3}, {6, 7, 8}};

        // 动态初始化
        String[][] arr = new String[3][2];
        String[][] arr1 = new String[3][];

        // 其他正确写法
        int[] arr2[] = new int[][]{{1, 2, 3}, {2, 3}, {6, 7, 8}};
        int arr3[][] = {{1, 2, 3}, {2, 3}, {6, 7, 8}};
        System.out.println(array[0][2]);
        System.out.println(arr[1][1]);

        //
        arr1[1] = new String[4];
        System.out.println(arr1[1][3]);

        for (int i = 0; i < arr2.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}