package com.study.java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {

    //***********以下是编译时异常**************
    @Test
    public void test7() throws FileNotFoundException {
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//        while (data != -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//
//        fis.close();

    }

    //************以下是运行时异常*************
    @Test
    public void test1(){
        // NullPointerException
        int[] arr = null;
        System.out.println(arr[3]);


        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));

    }

    @Test
    public void test2(){
        // ArrayIndexOutOfBoundsException
        int arr1[] = new int[3];
        System.out.println(arr1[10]);
    }

    @Test
    public void test3(){
        // ClassCastException
        Object obj = new Date();
        String str = (String) obj;
    }

    @Test
    public void test4(){
        // NumberFormatException
        String str = "abc";
        int num = Integer.parseInt(str);

    }

    @Test
    public void test5(){
        // InputMismatchException
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(score);
    }

    @Test
    public void test6(){
        // ArithmeticException
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

}
