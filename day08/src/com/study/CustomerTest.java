package com.study;
/*
*
* 类中方法的声明和使用
*
* 方法：描述类应该有的功能
* 比如：Math类：sqrt()\random()\...
*
* 方法的声明：权限修饰符 返回值类型 方法名(形参){
*       方法体
* }
*
* 方法的使用中 可以调用当前类的属性或方法
* 方法A中又调用方法A
*
* 说明：
*   关于权限修饰符：
*   private、public、缺省、protected
*
*   返回值问题：
*   1.如果方法有返回值 则必须在声明方法时 指定返回值的类型 同时 方法中 需要使用return关键字来返回指定类型的变量或常量
*   2.如果方法没有返回值 则方法声明时 使用void来表示 通常也不需要return 如果要使用 只能"return;"表示结束此方法的意思
*
*   方法名：
*   见名起意
*
*   形参列表：
*   格式：数据类型1 形参1,数据类型2 形参2,...
*
*   方法体：
*   方法功能的实现
*
* return关键字的使用
* 1.使用范围：使用字方法体中
* 2.作用：1) 结束方法
*        2) 针对有返回值类型的方法 使用"return 数据"方法返回所要的数据
* 3.return后不能跟执行语句
*
*
* */

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
//        cus1.eat();// 不能调用
    }
}

class Customer{

    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    private void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }

}
