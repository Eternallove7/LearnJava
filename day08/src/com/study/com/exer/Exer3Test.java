package com.study.com.exer;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test exer3 = new Exer3Test();
        int area = exer3.method();
        System.out.println(area);

        System.out.println(exer3.method1(6,6));
    }

    public int method(){
        for (int i = 0;i < 10;i++){
            for(int j = 0;j < 8;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        return 10 * 8;
    }

    public int method1(int m,int n){
        for (int i = 0;i < m;i++){
            for(int j = 0;j < m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}


