package com.study;

public class breakcontinueTest {
    public static void main(String[] args) {
        for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= 10; j++){
                if ( j % 4 == 0){
                    break;          // 结束本次
                    // continue;    // 结束一次
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
