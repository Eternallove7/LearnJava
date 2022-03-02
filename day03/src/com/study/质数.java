package com.study;

import java.util.Scanner;

public class 质数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        boolean isFlag = true;

        for (int i = 2;i <= num;i++){
            for (int j = 2;j < i - 1;j++){
                if (i % j == 0){
                    isFlag = false;
                }
            }
            if (isFlag){
                System.out.println(i + "是质数");
            }
            // 必须把isFlag给重置
            isFlag = true;
        }
    }
}
