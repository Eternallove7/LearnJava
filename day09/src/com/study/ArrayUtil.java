package com.study;

public class ArrayUtil {

    // 求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组的最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求数组的总和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    // 求数组的平均值
    public double getAvg(int[] arr){
        int sum = getSum(arr);
        return (double) sum / arr.length;
    }

    // 反转数组
    public void reverse(int[] arr){
        for (int i = 0;i < arr.length / 2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        print(arr);
    }

    // 复制数组
    public int[] copy(int[] arr){
        return null;
    }

    // 数组排序
    public void sort(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = 0;j < arr.length - 1 - i;j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

    // 遍历数组
    public void print(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 查找指定元素
    public int getIndex(int[] arr,int dest){
        int index = -1;
        for (int i = 0;i < arr.length;i++){
            if (dest == arr[i]){
                index = i;
            }
        }
        return index;
    }
}
