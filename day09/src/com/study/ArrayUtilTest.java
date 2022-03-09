package com.study;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        int min = util.getMin(arr);
        System.out.println("最小值为：" + min);

        int sum = util.getSum(arr);
        System.out.println("和为：" + sum);

        double avg = util.getAvg(arr);
        System.out.println("平均数为：" + avg);

        util.reverse(arr);

        util.sort(arr);

        int index = util.getIndex(arr,34);
        System.out.println("索引值为：" + index);
    }
}
