package com.study.exer1;

public class Circle {

    private double radius;// 半价

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

}
