package com.study;

/*
* switch(表达式){
* case 常量1:
*   执行语句;
*   // break;
* case 常量2:
*   执行语句;
*   // break;
* ...
*
* default:
*   执行语句;
*   // break;
* }
*
* */

public class SwitchCaseTest {
    public static void main(String[] args) {

        int num = 2;
        switch (num){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
        }
    }
}
