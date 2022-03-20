package com.study.java2;

import org.junit.Test;

/**
 * Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 *
 *
 */

public class WrapperTest {


    // String类型 ---> 基本数据类型、包装类:调用包装类的parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";

        // 错误的情况
//        int num = (int)str1;
//        Integer in1 = (Integer) str1;

        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }


    // 基本数据类型、包装类 ---> String类型：调用String重载的valueOf()
    @Test
    public void test4(){

        int num1 = 10;

        // 方式一 连接运算
        String str1 = num1 + "";

        // 方式二 调用String的valueOf()
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

        Double d1 = 12.4;
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);// "12.4"

    }


    /**
     * JDK5.0新特效：自动装箱与自动拆箱
     */

    @Test
    public void test3(){
        int num1 = 0;
        // 基本数据类型 --> 包装类的对象
        methods(num1);

        // 自动装箱 基本数据类型 --> 包装类的对象
        int num2 = 10;
        Integer in1 = num2;
        Integer in2 = 10;

        boolean b1 = true;
        Boolean b2 = b1;
        Boolean b3 = true;

        // 自动拆箱 包装类 ---> 基本数据类型
        System.out.println(in1.toString());

        int num3 = in1;// 自动拆箱

    }


    public void methods(Object obj){

    }

    // 包装类 ---> 基本数据类型、调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = Integer.valueOf(12);

        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = Float.valueOf(12.3f);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    // 基本数据类型 ---> 包装类、调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10;
//        System.out.println(num1.toString());
        // jdk1.8
//        Integer in1 = new Integer(num1);
//        Float f1 = new Float(12.3);
//        Boolean b1 = new Boolean(true);


        //jdk1.9以后
        Integer in1 = Integer.valueOf(num1);
        System.out.println(in1.toString());

        Float f1 = Float.valueOf(12.3f);
        Float f2 = Float.valueOf("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        System.out.println(b2);
        Boolean b3 = Boolean.valueOf("true123");
        System.out.println(b3);// false

        Order order = new Order();
        System.out.println(order.isMale);// false
        System.out.println(order.isFemale);// null
    }
}

class Order{
    boolean isMale;
    Boolean isFemale;
}
