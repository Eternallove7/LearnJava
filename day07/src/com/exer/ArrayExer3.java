package com.exer;

public class ArrayExer3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"E","T","E","R","N","A","L","L","O","V","E"};
        String[] arr1 = new String[arr.length];
        String[] arr2 = new String[]{"E","T","E","R","N","A","L","L","O","V","E"};
        // 数组的复制
        for (int i = 0;i < arr.length;i++){
            arr1[i] = arr[i];
        }

        // 数组的反转
        for (int i = 0;i < arr.length / 2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 查找
        // 线性查找
        String dest = "L";
        boolean isFlag = true;
        for (int i = 0;i < arr2.length;i++){
            if (dest.equals(arr2[i])){
                System.out.println("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag){
            System.out.println("很遗憾没找到");
        }

        // 二分法查找
        // 前提：查找的数组必须有序
        int[] arr3  = new int[]{-98,-34,-25,-18,-8,0,17,48,58,60,78,89,148,260,357};
        int dest1 = 17;
        int head = 0;
        int end = arr3.length - 1;
        boolean isFlag1 = true;
        while (head <= end){
            int middle = end / 2;
            if (dest1 == arr3[middle]){
                System.out.println("找到了指定的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            } else if (dest1 > arr3[middle]){
                head = middle + 1;
            } else {
                end = end - 1;
            }
        }
        if (isFlag1){
            System.out.println("很遗憾没找到");
        }

    }
}
