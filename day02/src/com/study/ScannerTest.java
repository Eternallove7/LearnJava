package com.study;
import java.util.Scanner;
/*
* 输入Scanner
* 判断String类型时不能用“==” 或 “！=” ，只能用xxx.equals()
* */
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入年龄");
        int age = scan.nextInt();

        System.out.println("请输入体重");
        double weight = scan.nextDouble();

        System.out.println("请输入性别");
        String sex = scan.next();

        if (age == 18 && weight <= 100 && sex.equals("女")){
            System.out.println("完美");
        } else if (sex.equals("男")) {
            System.out.println("兄弟你来搞笑是吧");
        } else if (age <= 18){
            System.out.println("年龄太小");
        } else if (weight <= 75 || weight >= 130){
            System.out.println("太胖");
        }
    }
}
