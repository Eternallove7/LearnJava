package com.study;

public class labelTest {
    public static void main(String[] args) {
        // 在循环前加入标签，名字自起
        label:for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= 10; j++){
                if ( j % 4 == 0){
                    break label;// 结束指定标识的一层循环结构
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}