package com.study.java3;

/**
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显示初始化/在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，通过"对象.属性"或"对象.方法"的方式赋值
 *
 *
 */

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{
    int orderId = 3;

    {
        orderId = 4;
    }
}
