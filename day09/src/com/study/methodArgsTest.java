package com.study;

/**
 *
 * 可变个数的形参:数据类型 ... 参数名
 * 当调用可变个数形参的方法时：传入的参数个数可以是0个，1个，2个...
 * 可变个数形参中，必须声明在末尾
 * 可变形参最多只能声明一个！
 *
 */

public class methodArgsTest {
    public static void main(String[] args) {
        methodArgsTest test = new methodArgsTest();
        test.show(12);
        test.show("hello");
        test.show("hello","world");
        test.show();
        test.show(new String[]{"AA","BB","CC"});
    }

    public void show(int i ){
        System.out.println("show(int)");
    }

    public void show(String s){
        System.out.println("show(String)");
    }

    public void show(String ... strs){
        System.out.println("show(String... stars)");

        for (int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
    }

//    public void show(String ... strs,int i){
//
//    }

//    public void show(String[] strs){
//
//    }

}
