package com.study.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 *
 * 1.举例： (o1,o2) -> Integer.compare(o1,o2);
 * 2.格式：
 *      -> :lambda操作符 或 箭头操作符
 *      ->左边：lambda形参列表
 *      ->右边：lambda体
 *
 * 3.Lambda表达式的使用：（分为6中情况使用）
 *
 *   总结：
 *   ->左边：Lambda形参列表的参数类型可以省略(类型推断)：如果lambda形参只有一个参数，()可以省略
 *   ->右边：lambda体应该使用一对{}包裹：如果lambda体只有一条执行语句(可能是return语句)，省略这一对{}和return
 *
 * 4.Lambda表达式的本质：作为接口的实例
 *
 * 5.如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
 *
 * 6.所以以前用匿名实现类表示的现在都可以用Lambda表达式来写
 *
 * @author RenAshbell
 * @create 2022-04-15-9:15
 */
public class LambdaTest1 {
    // 语法格式一：无参、无返回值
    @Test
    public void test1(){

        Runnable r1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("我爱北京故宫");

        r2.run();

    }
    // 语法格式二：Lambda需要一个参数，但没返回值
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>(){

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("欢迎光临");

        System.out.println("*******************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("谢谢惠顾");
    }

    // 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为"类型推断"
    @Test
    public void test3(){
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("谢谢惠顾");

        System.out.println("*********************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("谢谢惠顾");
    }

    @Test
    public void test4(){
        ArrayList<String> list = new ArrayList<>();

        int[] arr = {1,2,3};
    }

    // 语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test5(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("欢迎光临");

        System.out.println("*********************");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("谢谢惠顾");

    }

    // 语法五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return Integer.compare(o1,o2);
            }
        };

        System.out.println(com1.compare(12, 21));

        System.out.println("**************************");

        Comparator<Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return Integer.compare(o1,o2);
        };

        System.out.println(com2.compare(12, 6));

    }

    // 语法格式六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
    @Test
    public void test7(){
        Comparator<Integer> com1 = (o1,o2) -> {
            return Integer.compare(o1,o2);
        };

        System.out.println(com1.compare(12, 21));

        System.out.println("**************************");

        Comparator<Integer> com2 = (o1,o2) ->  Integer.compare(o1,o2);

        System.out.println(com2.compare(12, 21));

    }

    @Test
    public void test8(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("欢迎光临");

        System.out.println("*********************");

        Consumer<String> con2 = s -> System.out.println(s);
        con1.accept("欢迎光临");
    }


}
