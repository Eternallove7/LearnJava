package com.exer;

import java.util.Scanner;

public class YangHuiTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入几行：");
        int line = scan.nextInt();

        // 1.声明并初始化二维数组
        int[][] yanghui = new int[line][];

        // 2.给数组的元素赋值
        for (int i = 0;i < yanghui.length;i++){
            yanghui[i] = new int[i + 1];

            // 2.1给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;

            // 2.1给每行的非首末元素赋值
            for (int j = 1;j < yanghui[i].length - 1;j++){
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }


        }

        // 3.遍历二维数组
        for (int i = 0;i < yanghui.length;i++){
            for (int j = 0;j < yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }

    }
}
