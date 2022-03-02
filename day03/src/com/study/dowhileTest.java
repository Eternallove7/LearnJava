package com.study;

/*
* do-while循环
* 至少执行一次循环体
* */
public class dowhileTest {
    public static void main(String[] args) {
        int i = 100;
        int sum = 0;
        do {
            if (i % 2 == 0){
                sum += i;
            }
            i--;
        }while(i > 0);
        System.out.println(sum);
    }
}
