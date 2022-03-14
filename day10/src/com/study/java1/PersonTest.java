package com.study.java1;

/**
 * 类的结构：构造器(或构造方法、construction)的使用
 * construct：建设、建造
 *
 * 一、构造器的作用
 * 1.创建对象
 * 2.初始化对象的属性
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显示的定义了类的构造器之后，系统就不在提供默认的空参构造器
 *
 * 二、说明：
 * 1.如果没有显示的定义类的构造器的话，系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名(形参裂变){}
 *
 *
 */

public class PersonTest {
    public static void main(String[] args) {
        // 创建类的方法
        Person p1 = new Person();

        p1.eat();
        p1.setAge(12);
        System.out.println("年龄为" + p1.getAge());

        Person p2 = new Person("tom");
        System.out.println(p2.name);

    }
}

class Person{
    // 属性
    String name;
    private int age;

    // 构造器
    public Person(){
        age = 18;
    }

    public Person(String n){
        name = n;
    }

    // 方法
    public void eat(){
        System.out.println("人吃");
    }

    public void study(){
        System.out.println("人学");
    }

    public void setAge(int i){
        age = i;
    }

    public int getAge(){
        return age;
    }
}