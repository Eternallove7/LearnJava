package com.study.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：throws + 异常类型
 *
 * 1."throws + 异常类型"写在方法的声明处。指明此方法执行时，可能会抛出的异常类型
 *   一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常
 *   类型时，就会被抛出
 *
 * 2.try-catch-finally:真正的将异常给处理掉
 *   throws的方式只是将异常抛给了方法的调用者。并没有真正将异常解决
 *
 * 3.开发中如何选择？
 *    3.1如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws
 *       意味着如果子类重写的方法中有异常，必须使用try-catch-finally
 *    3.2执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的，可以先throws处理，执行的方法a再
 *       try-catch处理
 */

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e){
            e.printStackTrace();
        }

        method3();
    }

    public static void method3(){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void method2() throws IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello1.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
    }
}

class AA{
    public void m(){
        System.out.println("1");
    }
}