package com.study.java2;

import org.junit.Test;

/**
 * 1.创建Java类，此类默认提供无参的构造器
 * 2.此类中声明单元测试方法
 *   此时的单元测试方法，方法的权限是public，没有返回值，没有形参
 *
 * 3.次单元测试方法上需要声明注释：@Test，并在单元测试类中导入：import org.junit.Test;
 * 4.声明好单元测试方法以后，就可以在方法体内测试相关的代码。
 * 5.写完代码以后，左键双击单元测试方法名，右键执行
 *
 * 说明：
 * 1.如果执行结果没有任何异常：绿条
 * 2.如果执行结果出现异常：红条
 */

public class JUnitTest {

    int num = 10;

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        System.out.println(num);
    }

    public void show(){
        num = 20;
        System.out.println("show()...");
    }

    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());

    }
}
