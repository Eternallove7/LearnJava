package com.数组;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids;// 声明
        // 1.1静态初始化
        ids = new int[]{1001,1002,1003,1004};
        // 1.2动态初始化
        String[] names = new String[6];

        // 2.调用数组指定位置的元素
        names[0] = "陈大义";
        names[1] = "朱俊钊";
        names[2] = "吴佳权";
        names[3] = "郑文铖";
        names[4] = "潘岐峰";
        names[5] = "黄壁帆";

        // 3.获取数组长度
        System.out.println("数组长度为：" + names.length);

        // 4.遍历数组
        for (int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }


    }
}
