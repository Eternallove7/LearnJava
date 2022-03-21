package com.study.java3;

/**
 * 类的成员之四：代码块(或初始化块)
 *
 * 1.代码块的作用：用来初始化类或对象
 * 2.代码块如果有修饰的话只能使用static
 * 3.分类：静态代码块 和 非静态代码块
 *
 * 4.静态代码块
 *      > 内部可以有输出语句
 *      > 随着类的加载而执行，而且只执行一次
 *      > 初始化类的信息
 *      > 如果一个类中定义了多个代码块，则按照声明的先后顺序执行
 *      > 静态代码块的执行要优先于非静态代码块的执行
 *      > 静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
 *
 * 5.非静态代码块
 *      > 内部可以有输出语句
 *      > 随着对象的创建而执行
 *      > 每创建一个对象就执行一次非静态代码块
 *      > 作用：可以在创建对象时，对对象的属性等进行初始化
 *      > 如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 *      > 非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
 *
 *
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显示初始化
 * ③构造器中初始化
 * ④有了对象以后，通过"对象.属性"或"对象.方法"的方式赋值
 * ⑤在代码块中赋值
 *
 */

public class BlockTest {
    public static void main(String[] args) {

        String desc = Person.desc;

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);
        System.out.println(desc);

        Person.info();
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // static静态代码块
    static {
        System.out.println("hello,static block-1");
    }

    static {
        System.out.println("hello,static block-2");
        desc = "我是一个好人！";
        info();
//        eat();
//        name = "tom";
    }

    // 非static代码块
    {
        age = 1;
        System.out.println("hello bolck-1");
        // 调用静态结构
        info();
        // 调用非静态结构
        eat();
        name = "tom";
    }

    {
        age = 2;
        System.out.println("hello bolck-2");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("!!!!!!");
    }
}
