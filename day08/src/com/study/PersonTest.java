package com.study;

/*
*
* 创建类的对象 = 类的实例化 = 实例化类
*
* 1.创建类：设计类的成员
* 2.创建类的对象
* 3.通“对象.属性/方法”来调用相关功能
*
* 如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的系统(非static类)
* */

// 测试类
public class PersonTest {
    public static void main(String[] args) {
        // 创建person类的对象
        Person p1 = new Person();

        // 调用对象结构：属性、方法
        // 调用属性：“对象.属性”
        p1.name = "zhu";
        p1.age = 19;
        p1.isMale = false;

        // 调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        p2.name = "Zun";
        p2.age = 43;

        Person p3 = p1;
        System.out.println(p3.name);

        p1.name = "zhao";
        System.out.println(p3.name);



    }
}

class Person{

    // 属性
    String name;
    int age;
    boolean isMale;


    // 方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以说话，使用的是" + language);
    }

}
