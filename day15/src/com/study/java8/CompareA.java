package com.study.java8;

/**
 * JDK8：除了定义全局常量和抽象方法以外，还可以定义静态方法、默认方法
 *
 */

public interface CompareA {

    // 静态方法
    public static void method1(){
        System.out.println("compareA：北京");
    }

    // 默认方法
    public default void method2(){
        System.out.println("compareB：伤害");
    }

    default void method3(){

    }
}
