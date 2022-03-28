package com.study.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 涉及到String类与其他结构之间的转换
 *
 * @author RenAshbell
 * @create 2022-03-28 17:39
 */
public class StringTest1 {

    /*
    String 与 byte[]之间的转换
    编码：String --> byte[]:调用String的getBytes()
    解码：byte[] --> String:调用String的构造器

    编码：字符串 --> 字节(看得懂 --> 看不懂的二进制数据)
    解码：编码的逆进程,字节 --> 字符串(看不懂的二进制数据 --> 看得懂)

    说明：解码时，要求解码使用的字符集必须与编码使用的字符集一致，否则会出现乱码


     */

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();// 使用默认的字符集，进行转换
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        System.out.println("*************************");

        String str2 = new String(bytes);// 使用默认的字符集，进行解码
        System.out.println(str2);

        String str4 = new String(gbks, "gbk");
        System.out.println(str4);
    }

    /*
    String 与 char[]之间的转换

    String --> char[]:调用String的toCharArray()
    char[] --> String:调用String的构造器

     */

    @Test
    public void test2(){
        String str1 = "abc123";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

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
