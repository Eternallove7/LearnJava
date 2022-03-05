package com.数组;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 1.二维数组的声明和初始化

        // 静态初始化
        int[][] array = new int[][]{{1,2,3},{2,3},{6,7,8}};

        // 动态初始化1
        String[][] arr = new String[3][2];// 3行2列

        // 动态初始化2
        String[][] arr1 = new String[3][];// 3行未知列

        // 其他写法
        int[] arr2[] = new int[][]{{1,2,3},{2,3},{6,7,8}};
        int[] arr3[] = {{1,2,3},{2,3},{6,7,8}};

        // 调用数组的指定位置的元素
        System.out.println(array[0][2]); //2
        System.out.println(arr[1][1]); //null

        arr1[1] = new String[4]; // 新建了4列String类型
        System.out.println(arr1[1][3]);

        // 遍历二维数组
        for (int i = 0;i < arr2.length;i++){
            for (int j = 0;j < arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
