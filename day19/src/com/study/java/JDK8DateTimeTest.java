package com.study.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * jdk 8中日期时间API的测试
 *
 * @author RenAshbell
 * @create 2022-03-29 16:03
 */
public class JDK8DateTimeTest {
    @Test
    public void testDate(){
        // 偏移量
        Date date1 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(date1);
    }





    /*
    LocalDate、LocalTime、LocalDateTime 的使用
    说明：
        1.LocalDateTime相较于LocalDate、LocalTime，使用评率更高些
        2.类似于Calendar

     */
    @Test
    public void test1(){
        // now()：获取当前的日期、时间、时间+日期
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        // of()：设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1);

        // getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());


        // 体现不可变性
        // withXxx()：设置相关的属性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        System.out.println("*******************************");

        // 设置
        LocalDateTime localDateTime3 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);


        System.out.println("*******************************");


        // 增加
        LocalDateTime localDateTime4 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);


        System.out.println("*******************************");


        // 减少
        LocalDateTime localDateTime5 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime5);
    }






    /*
    Instant的使用
    类似于java.util.Date类

     */

    @Test
    public void test2(){
        // now()：获取本初子午线线对应的时间
        Instant instant = Instant.now();
        System.out.println(instant);

        // 添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        // 获取对应的毫秒数
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);

        // 解析时间
        Instant instant1 = Instant.ofEpochMilli(1648544714288L);
        System.out.println(instant1);
    }





    /*
    DateTimeFormatter：格式化或解析日期、时间
    类似于SimpleDateFormat
     */

    @Test
    public void test3(){
        // 方式一：预定义的标准格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        // 格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);

        System.out.println(localDateTime);
        System.out.println(str1);

        // 解析：字符串 ---> 日期
        TemporalAccessor parse = formatter.parse("2022-03-29T17:20:20.3180135");
        System.out.println(parse);




        // 方式二：本地化相关的格式
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // 格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String str3 = formatter2.format(LocalDateTime.now());
        System.out.println(str3);



        // 方式三：自定义的格式
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        // 格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);

        // 解析：
        TemporalAccessor accessor = formatter3.parse("2022-03-29 05:33:34");
        System.out.println(accessor);

    }
}
