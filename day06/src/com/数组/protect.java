package com.数组;

import java.util.Scanner;

public class protect {
    public static void main(String[] args) {
        // 1.使用Scanner，读取学生个数
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scan.nextInt();

        // 2.创建数组，存储学生成绩
        int[] totalsorce = new int[count];
        System.out.println("请输入" + count + "个成绩：");


        int maxScore = 0;
        // 3.给数组中的元素赋值,顺便求最大值
        for(int i = 0;i < totalsorce.length;i++){
            totalsorce[i] = scan.nextInt();
            if(maxScore < totalsorce[i]){
                maxScore = totalsorce[i];
            }
        }

        // 5.根据每个学生成绩与最高分的差距
        char level;
        for(int i = 0;i < totalsorce.length;i++){
            if(maxScore - totalsorce[i] <= 10){
                level = 'A';
            } else if(maxScore - totalsorce[i] <= 20){
                level = 'B';
            } else if(maxScore - totalsorce[i] <= 30){
                level = 'C';
            } else {
                level = 'D';
            }

            System.out.println("student" + i + " score is " + totalsorce[i] + ",grade is " + level);
        }
    }
}
