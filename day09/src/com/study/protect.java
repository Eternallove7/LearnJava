package com.study;


public class protect {
    public static void main(String[] args) {
        PassObject p = new PassObject();
        Circle c = new Circle();
        p.printAreas(c, 5);// 调用printAreas方法

        System.out.println("now radius is " + c.radius);
    }
}

class Circle{
    double radius;

    public double findArea(){
        return radius * Math.PI * radius;
    }
}

class PassObject{
    /**
     * 打印输出1到time之间的每个整数半径值，以及对应面积
     * 例如：time为5，则输出半径1,2,3,4,5，以及对应的圆面积
     * @param c 对象
     * @param time 次数
     */
    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\t\tArea");
        for (int i = 1;i <= time;i++){
            c.radius = i;
            double area = c.findArea();
            System.out.println(c.radius + "\t\t\t\t" + area);
        }

        // 重新赋值
        c.radius = time + 1;
    }
}
