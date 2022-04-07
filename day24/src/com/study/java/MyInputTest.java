package com.study.java;

/**
 * @author RenAshbell
 * @create 2022-04-07-20:42
 */
public class MyInputTest {
    public static void main(String[] args) {
        MyInput mi = new MyInput();
        System.out.println("请输入字符：");
        String str = mi.readString();
        System.out.println(str);
    }
}
