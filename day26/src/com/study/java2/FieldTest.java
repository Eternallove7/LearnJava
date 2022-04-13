package com.study.java2;

import com.study.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取当前运行时类的属性结构
 * @author RenAshbell
 * @create 2022-04-13-14:51
 */
public class FieldTest {

    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.study.java1.Person");

        // 获取属性结构
        // getFields()：获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields){
            System.out.println(field);
        }

        System.out.println();

        // getDeclareFields()：获取当前运行时类中声明的所有属性。（不包含父类的所有属性）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields){
            System.out.println(f);
        }
    }

    // 权限修饰符  数据类型  变量名
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.study.java1.Person");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields){
            // 1.权限修饰符
            int modifier = f.getModifiers();
            System.out.print(Modifier.toString(modifier) + "\t");

            // 2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");

            // 3.变量名
            String fn = f.getName();
            System.out.print(fn);

            System.out.println();
        }
    }
}
