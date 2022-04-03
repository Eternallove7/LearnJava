package com.study.java2;

import org.junit.Test;

import java.util.*;

/**
 * 1.泛型在继承方面的体现
 *
 * 2.通配符的使用
 *
 * @author RenAshbell
 * @create 2022-04-03-20:01
 */
public class GenericTest {

    /*
    1.泛型在继承方面的体现

      类A是类B的父类：G<A>和G<B>二者不具备子父类关系，二者是并列关系

      补充：类A是类B的父类，A<G> 是 B<G> 的父类
     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;

        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        // 此时的list1和list2的类型不具有子父类关系
        // 编译不通过
//        list1 = list2;

        /*
        反证法：
        假设list1 = list2
        list1.add(123);导致混入非String的数据，出错。
         */
        show(list1);
        show1(list2);

    }

    public void show1(List<String> list){

    }

    public void show(List<Object> list){

    }

    @Test
    public void test2(){
        AbstractList<String> list = null;
        List<String> list1 = null;
        ArrayList<String> list2 = null;

        list = list2;
        list1 = list2;

        List<String> list3 = new ArrayList<>();

    }
    /*
    2.通配符的使用
      通配符：?

      类A是类B的父类，G<A>和G<B>是没有关系的，二者的共同父类是：G<?>
     */

    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

//        print(list1);
//        print(list2);

        //
        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        // 添加：对于List<?>就不能向其内部添加数据：
//        list.add()
        list.add(null);

        // 获取(读取)：
        Object o = list.get(0);
        System.out.println(o);

    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /*
    3.有限制条件的通配符的使用
        ? extends Person:
                    G<? extends A>可以作为G<A>和G<B>的父类，其中B是A的子类

        ? super Person:
                    G<? super A>可以作为G<A>和G<B>的父类，其中B是A的父类
     */
    @Test
    public void test4(){
        List<? extends Person> list1 = null;// 必须是Person或Person的子类
        List<? super Person> list2 = null;// 必须是Person或Person的父类

        List<Student> list3 = new ArrayList<Student>();
        List<Person> list4 = new ArrayList<Person>();
        List<Object> list5 = new ArrayList<Object>();

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;

        // 读取数据
        list1 = list3;
        Person person = list1.get(0);


        list2 = list4;
        Object object = list2.get(0);

        // 写入数据
        // 编译不通过
//        list1.add(new Student());// 最大类为Person，但最小类不确定，万一添加的类比？的类还要大，那就不能添加，因此、Java出于安全考虑不允许添加

        list2.add(new Person());// 最小类确定为Person，因此可以添加Person或Person的子类
        list2.add(new Student());
    }
}
