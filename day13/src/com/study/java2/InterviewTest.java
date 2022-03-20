package com.study.java2;

import org.junit.Test;

public class InterviewTest {

    @Test
    public void test1(){
        Object o1 = true ? Integer.valueOf(1) : Double.valueOf(2.0);
        System.out.println(o1);// 1.0

        Object o2 = Integer.valueOf(2);
        System.out.println(o2);

        String str1 = "1";
        String str2 = "1";
        System.out.println(str1 == str2);
    }

    @Test
    public void test2(){
        Object o2;
        if (true)
            o2 = Integer.valueOf(1);
        else
            o2 = Double.valueOf(2.0);
        System.out.println(o2);
    }

    @Test
    public void method1() {
        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf(1);
        System.out.println(i == j);// true
        // Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        // 保存了从-128~127范围的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
        // -128 ~ 127范围内时，可以直接使用数组中的元素，不用再去new了。目的：提高效率
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);// true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);// false
    }
}
