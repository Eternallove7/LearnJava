package com.study;

import java.util.Scanner;

// System.currentTimeMillis();      获取时间
// Math.sqrt(2);                    根号2

public class 质数优化一 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        boolean isFlag = true;
        int count = 0;

        // 获取当前时间
        long start = System.currentTimeMillis();

        for (int i = 2;i <= num;i++){
            // 对本身是质数的自然数有效
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
//                System.out.println(i + "是质数");
                count++;
            }
            // 必须把isFlag给重置 不然不给只能输出2和3
            isFlag = true;
        }
        System.out.println(num + "是质数的有" + count);

        // 获取结束时间
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
    }
}
