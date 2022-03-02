package com.study;
import java.util.Scanner;

public class forTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入m：");
        int m = scanner.nextInt();

        System.out.println("请输入n");
        int n = scanner.nextInt();

        int min = (m<=n)? m : n;
        for (int i = min;i > 0;i--){
            if (m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
        }
        int max = (m > n)? m : n;
        for (int i = max;i < m * n;i++){
            if (i % m == 0 && i % n == 0){
                System.out.println("最小公倍数：" + i);
                break;
            }
        }

    }
}
