package com.study;

/*
* 强制类型转换：自动类型提升运算的逆运算
* 1.需要使用强转符：()
* 2.可能会导致精度损失
*
* String属于引用数据类型
* 声明String变量时，使用一对""
* String可以和8种基本数据类型变量做运算，且运算只能是：+
* */
public class day02 {
    public static void main(String[] args){
        double d1 = 12.3;
        int i1 = (int)d1;
        System.out.println(i1);

        // 必须在long后面加L，float后面加F
        long l1 = 1211515414L;
        float f1 = 10.2F;
        System.out.println(l1);
        System.out.println(f1);

        String s1 = "Hello World!";
        System.out.println(s1);

        String s2 = "I think you are ";
        boolean b1 = true;
        String s3 = s2 + b1;
        System.out.println(s3);

        String str1 = 123 + "";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        int i = 1;
        i *= 0.1;
        System.out.println(i);
        i++;
        System.out.println(i);

        // 三元运算符
        int m = 12;
        int n = 11;
        int max =  (m > n)? m : n;
        System.out.println(max);

    }
}
