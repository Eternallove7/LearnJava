package com.study;

public class ifelse {
    public static void main(String[] args){
        int age = 75;
        if (age < 0){
            System.out.println("不存在");
        } else if (age > 250){
            System.out.println("不可能");
        } else {
            System.out.println("合理");
        }
    }
}
