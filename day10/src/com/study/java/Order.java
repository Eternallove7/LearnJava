package com.study.java;

public class Order {
    public static void main(String[] args) {
        OrderTest order = new OrderTest();
        order.orderDefault = 1;
        order.orderPublic = 2;

        // 出了order类后，私有的结构就不可以调用了
//        order.orderPrivate = 3;


        order.methodDeault();
        order.methodPublic();

//        order.methodPrivate();
    }
}
