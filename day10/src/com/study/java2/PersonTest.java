package com.study.java2;

/**
 * this关键字的使用：
 * 1.this可以用来修饰：属性、方法、构造器
 *
 * 2.this修饰属性和方法：
 *   this理解为：当前对象
 *
 *
 * 3.this调用构造器
 *  在类的构造器中，可以显示的使用"this(形参列表)"方式，调用本来中指定的其他构造器
 *  但不能调用自身构造器
 *  规定："this(形参列表)"必须声明在当前构造器的首行
 *  构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setAge(1);
        System.out.println(p1.getAge());
    }
}

class Person{
    private int age;
    private String name;

    public Person(){
        System.out.println("调用成功");
    }

    public Person(String n){
        this();
        this.name = n;
    }

    public Person(String n,int age){
        this(n);
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
