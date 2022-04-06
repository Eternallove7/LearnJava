package com.study.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author RenAshbell
 * @create 2022-03-31-19:47
 */
public class TreeSetTest {

    /*
    1.向TreeSet中添加的数据，要求是相同类的对象
    2.两种排序方式：自然排序(实现Comparable接口) 和 定制排序

    3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0，不再是equals()
    4.定制排序中，比较两个对象是否相同的标准为：compare()返回0，不再是equals()
     */

    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        // 失败：不能添加不同类对象
//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new User("Tom",12));

        // 举例一
//        set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(11);
//        set.add(8);
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            // 按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(),user2.getAge());
                } else {
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(comparator);
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Mary",33));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}