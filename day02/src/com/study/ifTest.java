package com.study;
import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peopleage = 0;
        System.out.println("请输入狗的年龄：");
        int age = scanner.nextInt();
        if (age <= 2 && age >0){
            peopleage = 10.5 * age;
            System.out.println("狗子的年龄相当于人类年龄的：" + peopleage + "岁");
        } else if (age > 2){
            peopleage = 21 + ((age-2) * 4);
            System.out.println("狗子的年龄相当于人类年龄的：" + peopleage + "岁");
        } else {
            System.out.println("请输入正确的年龄！");
        }



        // 随机数测试 [10,99]
        int value = (int)(Math.random() * 90 + 10);
        System.out.println("随机数为：" + value);

    }
}
