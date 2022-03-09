package com.study;

/**
 * 方法的重载
 *
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 *
 *      "两同一不同"：同一个类，相同方法名
 *                  参数列表不同:参数个数不同，参数类型不同
 *
 * 2.举例：
 *  Arrays类中重载的sort() / binarySearch()
 *
 * 3.判断是否重载
 *      跟方法的权限修饰符、返回类型、形参变量名、方法体都没关系
 *
 * 4.在通过对象调用方法时，如何确定某一个指定的方法
 *      方法名 ---> 参数列表
 */

public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1,2);
    }

    public void getSum(int i,int j){
        System.out.println("2");

    }

    public void getSum(double a,double b){
        System.out.println("3");

    }

    public void getSum(String i,int j){
        System.out.println("4");

    }

    public void getSum(int i,String j){
        System.out.println("1");

    }

}
