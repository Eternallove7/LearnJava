package com.study.exer2;

import java.util.Objects;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001,"AA");
        Order o2 = new Order(1001,"BB");

        System.out.println(o1.equals(o2));

        Order o3 = new Order(1001,"BB");
        System.out.println(o2.equals(o3));
    }
}

class Order{
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

}
