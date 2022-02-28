package com.study;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");

        // 变量定义
        int myage = 12;
        System.out.println(myage);

        // 当byte、char、short三种类型的变量做运算时，结果为int型（包括同类型相加）
        byte b1 = 2;
        byte b2 = 4;
        int b3 = b1 + b2;
        System.out.println(b3);

        char c1 = 'a';
        byte c2 = 7;
        int c3 = c1 + c2;
        System.out.println(c3);
    }
}
