package com.study.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义泛型类
 * @author RenAshbell
 * @create 2022-04-03-16:43
 */
public class Order<T> {

    String ordername;
    int orderId;

    // 类的内部结构就可以使用类的泛型

    T orderT;

    public Order(){
        // 编译不通过
//        T[] arr=  new T[110];
        T[] arr = (T[]) new Object[10];
    }

    public Order(String ordername,int orderId,T orderT){
        this.ordername = ordername;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    // 如下的三个方法都不是泛型方法
    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordername='" + ordername + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    // 静态方法中不能使用类的泛型
    // 静态方法随着类的加载而加载，此时还没有指明泛型类型
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }

    // 泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    // 换句话说，泛型方法所属的类是不是泛型类都没有关系
    // 泛型方法，可以声明为静态的，因为泛型参数是在调用方法时确定的，并非在实例化时确定。
    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();

        for (E e : arr){
            list.add(e);
        }
        return list;

    }

}
