package com.study;

import java.util.Scanner;

public class 质数算法优化二 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int count = 0;

        // 获取当前时间
        long start = System.currentTimeMillis();

        label:for (int i = 2;i <= num;i++){
            // 对本身是质数的自然数有效
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    continue label;

                }
            }
            count++;
        }
        System.out.println(num + "是质数的有" + count);

        // 获取结束时间
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
    }
}
