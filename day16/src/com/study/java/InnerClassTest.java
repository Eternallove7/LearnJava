package com.study.java;

/**
 * 在局部内部类的方法中，想调用局部内部类所声明方法的局部变量的话，要求此局部变量
 * 声明为final的
 *
 * jdk7之前的版本：要求此局部变量显示的声明为final的
 * jdk8之后的版本，可以省略不写
 *
 */

public class InnerClassTest {
    public void method(){
        // 局部变量
        int num = 10;
        class AA{
            public void show(){
                System.out.println(num);
            }
        }
    }
}
