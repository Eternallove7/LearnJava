package com.study.java;

import org.junit.Test;

/**
 * 涉及到String类与其他结构之间的转换
 *
 * @author RenAshbell
 * @create 2022-03-28 17:39
 */
public class StringTest1 {
    /*
    String 与 基本数据类型、包装类之间的转换
    String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
    基本数据类型、包装类 --> String：调用String重载的valueof(xxx)

     */
    @Test
    public void test1(){
        String str1 = "113";
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);// "123"
        String str3 = num + "";

        System.out.println(str1 == str3);// false
    }

}
