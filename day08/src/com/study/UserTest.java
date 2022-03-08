package com.study;

/*
* 类中属性的使用
*
* 属性 vs 局部变量
* 1.相同点：
*   1.1定义变量的格式：数据类型、 变量名 = 变量值
*   1.2先声明 后使用
*   1.3变量都有其对应的作用域
*
* 2.不同点：
*   2.1 在类中声明的位置不同
*   属性：直接定义在类的一对{}内
*   局部变量：将声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量.
*
*   2.2关于权限修饰符的不同
*   属性：可以在声明属性时 指明其权限 使用权限修饰符
*       常用的权限修饰符：private、public、缺省、protected -->封装性
*   局部变量：不可以使用权限修饰符
*
*   2.3默认初始化值
*   属性：类的属性 根据其类型 都有默认的初始化
*       整形(byte、short、int、long)，0
*       浮点型(float、double)，0.0
*       字符型(char)，0
*       布尔型(boolean)，false
*
*       引用数据类型(类、数组、接口)，null
*
*   局部变量：没有默认初始化值
*       调用局部变量之前，一定要显式赋值
*       特别地：形参在调用时，我们赋值即可
*
*   2.4在内存中加载
*   属性：加载到堆空间中
*   局部变量：加载到栈空间中
*
*
* */
class User{
    // 属性
    String name;
    int age;
    boolean isMale;

    public void talk(String languge){//形参
        System.out.println("我们使用" + languge + "进行交流");
    }

    public void eat(){
        String food = "饭";
        System.out.println("人可以吃" + food);
    }
}



public class UserTest {
    public static void main(String[] args) {

    }
}
