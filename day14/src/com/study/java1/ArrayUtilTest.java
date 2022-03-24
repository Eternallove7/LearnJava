package com.study.java1;

public class ArrayUtilTest {
    public static void main(String[] args) {

        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        int max = ArrayUtil.getMax(arr);
        System.out.println("最大值为：" + max);

        int min = ArrayUtil.getMin(arr);
        System.out.println("最小值为：" + min);

        int sum = ArrayUtil.getSum(arr);
        System.out.println("和为：" + sum);

        double avg = ArrayUtil.getAvg(arr);
        System.out.println("平均数为：" + avg);

        ArrayUtil.reverse(arr);

        ArrayUtil.sort(arr);

        int index = ArrayUtil.getIndex(arr,34);
        System.out.println("索引值为：" + index);
    }
}
