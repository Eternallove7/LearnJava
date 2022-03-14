package com.study.java1;

/**
 * 总结：属性赋值的先后顺序
 *
 * 1.默认初始化值
 * 2.显示初始化
 * 3.构造器中初始化
 *
 * 4.通过"对象.方法"赋值
 *
 * 操作的先手顺序：1 - 2 - 3 - 4
 */

public class UserTest {
    public static void main(String[] args) {
        User u = new User();

        System.out.println(u.age);

        User u1 = new User(2);
        System.out.println(u1.age);

        u1.setAge(3);
        System.out.println(u1.age);

    }
}

class User{
    String name;
    int age = 1;

    public User(){

    }

    public User(int i){
        age = i;
    }

    public void setAge(int a){
        age = a;
    }

}
