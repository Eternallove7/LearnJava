package com.study.java;

import org.junit.Test;

import java.util.Date;

/**
 * JDK8 之前的日期和时间API测试
 *
 * @author RenAshbell
 * @create 2022-03-28-23:10
 */
public class DateTimeTest {

    /*
    java.util.Date类
            /---java.sql.Date类
    1.两个构造器的使用

    2.两个方法的使用
        > toString()：显示当前的年、月、日、时、分、秒
        > getTime()：获取当前Date对象对应的时间戳。

    3.java.sql.Date对应着数据库中的日期类型的变量
        > 如何实例化
        > 如何将java.util.Date对象转换成java.sql.Date对象

     */
    @Test
    public void test2(){
        // 构造器一：Date()：创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());// Mon Mar 28 23:14:53 CST 2022

        System.out.println(date1.getTime());// 1648480493748

        // 构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1648480493748L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1648580493748L);
        System.out.println(date3);// 2022-03-30

        // 情况二
//        Date date4 = new java.sql.Date(1649580493748L);
//        java.sql.Date date5 = (java.sql.Date) date4;

        // 情况二
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());

    }

    // 1.System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        // 时间戳
        System.out.println(time);
    }
}
