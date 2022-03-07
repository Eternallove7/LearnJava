package com.exer;

public class ArrayCompute {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * (90 - 10 + 1) + 10);
        }

        // 求数组中最大值
        int maxValue = arr[0];
        System.out.print("随机数为：");
        for (int i = 1;i < arr.length;i++){
            System.out.print(arr[i] + " ");
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println();
        System.out.println("随机数最大值为：" + maxValue);

        // 求数组中最小值
        int minValue = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("随机数最小值为：" + minValue);

        // 求数组和
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("随机数的总和为：" + sum);

        // 求数组平均值
        double avg = (double) sum / arr.length;
        System.out.println("随机数平均数为：" + avg);

    }
}
