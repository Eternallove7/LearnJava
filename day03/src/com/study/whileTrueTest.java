package com.study;

import java.util.Scanner;

public class whileTrueTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pi = 0;
        int ni = 0;
        while(true){
            int num = scan.nextInt();

            if (num > 0){
                pi++;
            } else if (num < 0){
                ni++;
            } else {
                break;
            }
        }
        System.out.println("正数：" + pi + "\t负数：" + ni);
    }
}
