package com.study.java;

/**
 * Java规定的4种权限：private、缺省、protect、public
 * 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *      修饰类的话：只能使用：缺省、public
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "旺财";
        a.age = 1;
//        a.legs = -4;
        a.setLegs(6);
        a.show();
    }
}

class Animal{

    String name;
    int age;
    private int legs;// 私有

    // 对属性的设置
    public void setLegs(int l){
        if (l >= 0 &&  l % 2 == 0){
            legs = l;
        } else {
            legs = 0;
        }
    }

    // 对属性的获取
    public int getLags(){
        return legs;
    }

    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){
        System.out.println("name=" + name + " age=" + age + " legs=" + legs);
    }

}
