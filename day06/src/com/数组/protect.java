package com.数组;

import java.util.Scanner;

public class protect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scan.nextInt();
        int[] totalsorce = new int[count];
        System.out.println("请输入" + count + "个成绩：");
        int maxScore = 0;
        for (int i = 0; i < totalsorce.length; ++i) {
            totalsorce[i] = scan.nextInt();
            if (totalsorce[i] >= maxScore){
                maxScore = totalsorce[i];
            }
        }

        char level;
        for (int i = 0; i < totalsorce.length; ++i) {
            if (maxScore - totalsorce[i] <= 10){
                level = 'A';
            } else if (maxScore - totalsorce[i] <= 20) {
                level = 'B';
            } else if (maxScore - totalsorce[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }

            System.out.println("student" + i + " score is " + totalsorce[i] + ",grade is " + level);
        }
    }
}
