package com.study.java1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Circle c2 = new Circle();

        Circle c3 = new Circle(3.4);

        System.out.println("c1的id：" + c1.getId());
        System.out.println("c2的id：" + c2.getId());
        System.out.println("c3的id：" + c3.getId());
        System.out.println("c3的面积：" + c3.findArea());

        System.out.println("创建的圆的个数为：" + Circle.getTotal());


    }
}

class Circle{
    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    private static int total;
    private static int init = 1001;// static声明的属性被所有对象共享

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}