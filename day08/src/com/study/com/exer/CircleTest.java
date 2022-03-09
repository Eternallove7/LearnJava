package com.study.com.exer;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 2;
        double area = cir.findArea();
        System.out.println(area);
    }
}
