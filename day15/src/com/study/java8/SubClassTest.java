package com.study.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

//        SubClass.m1();

        // 1.接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();

        // 2.通过实现类的对象，可以调用接口中的默认方法
        // 如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
        s.method2();
        s.method3();

        // 3.如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法。
        // 那么子类在没有重写次方法的情况下，默认调用的是父类的同名同参

        // 4.如果实现类实现了多个接口，而这多个接口中定义了同名同参的默认方法，
        // 那么在实现类没有重写此方法的情况下，报错！



    }
}

class SubClass extends SuperClass implements CompareA,CompareB{
    public static void m1(){
    }

    @Override
    public void method2() {
        System.out.println("SubClass：上海");
    }

    @Override
    public void method3() {
        super.method3();
    }

    public void myMethod(){
        method3();// 调用自己定义的重写的方法
        super.method3();// 调用的是父类声明的

        // 调用的是接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}