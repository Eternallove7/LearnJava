package com.study.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * jdk 8之前的日期时间的API测试
 * 1. System类中currentTimeMillis();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 * @author RenAshbell
 * @create 2022-03-29 15:00
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1.两个操作：
    1.1 格式化：日期 ---> 字符串
    1.2 解析：格式化的逆过程，字符串 ---> 日期

    2.SimpleDateFormat的实例化

     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        // 实例化：使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        // 格式化：日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        // 解析：格式化的逆过程，字符串 ---> 日期
        String str = "2022/3/29 下午3:04";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        // *********按照指定的方式格式化和解析：调用带参的构造器************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        // 格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);// 2022-03-29 03:10:58

        // 解析
        Date date2 = sdf1.parse("2020-03-29 03:10:58");
        System.out.println(date2);

    }

    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date

    练习二："三天打渔两天晒网" 1990-01-01  打渔？晒网？

    总天数的计算？
    方式一：(date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
    方式二：1990-01-01 --> 2019-12-31 + 2020-01-01 ---> 2020-09-08
     */

    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);

        java.sql.Date birthdate = new java.sql.Date(date.getTime());
        System.out.println(birthdate);
    }

    /*
    Calendar日历类的使用

     */
    @Test
    public void testCalendar(){
        // 1.实例化
        // 方式一：创建其子类对象
        // 方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());

        // 2.常用方法
        // get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        // set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        // add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        // getTime()：日历类 ---> Date
        Date date = calendar.getTime();
        Date date1 = new Date();
        System.out.println(date == date1);// false


        // setTime()：Date ---> 日历类
        Date date2 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }


    public int testExer1(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date);
        long oldTime = parse.getTime();

        String t1 = "1990-01-01";
        Date parse1 = sdf.parse(t1);
        long time = parse1.getTime();

        int newTime = (int)((oldTime - time) / 1000 * 60 * 60 * 24) + 1 ;
        return newTime;


    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当前日期(格式：2022-03-29)：");
        String date = scanner.next();

        DateTimeTest dateTimeTest = new DateTimeTest();
        int day = dateTimeTest.testExer1(date);

        if (day % 5 >= 1 && day % 5 <= 3){
            System.out.println(date + "那天在打渔！");
        } else if (day % 5 == 4 || day % 5 == 0){
            System.out.println(date + "那天在晒网！");
        }
    }
}
