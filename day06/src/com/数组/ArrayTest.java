package com.数组;

public class ArrayTest {
    public static void main(String[] args) {
        // 静态一维数组
        int[] ids = new int[]{1001, 1002, 1003, 1004};

        // 动态一维数组
        String[] names = new String[6];
        names[0] = "陈大义";
        names[1] = "朱俊钊";
        names[2] = "吴佳权";
        names[3] = "郑文铖";
        names[4] = "潘岐峰";
        names[5] = "黄壁帆";

        System.out.println("数组长度为：" + names.length);
        for (int i = 0; i < names.length; ++i) {
            System.out.println(names[i]);
        }
    }
}
