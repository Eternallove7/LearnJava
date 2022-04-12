package com.study.java;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * RandomAccessFile的使用
 * 1.RandomAccessFile直接继承于java.lang.Object类，实现了DataInput和DataOutput接口
 * 2.RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 *
 * 3.如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建
 *   如果文件存在，则会对原有的文件内容进行覆盖（默认情况下从头覆盖）
 *
 * 4.可以通过相关的操作，实现RandomAccessFile插入数据
 *
 * @author RenAshbell
 * @create 2022-04-12-11:52
 */
public class RandomAccessFileTest {

    @Test
    public void test1() {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("qq.jpg"),"r");
            raf2 = new RandomAccessFile(new File("qq1.jpg"),"rw");

            byte[] buffer = new byte[1044];
            int len;
            while ((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");

        // 将指针调到角标为3的位置
        raf1.seek(3);
        raf1.write("xyz".getBytes());// 覆盖数据
        raf1.close();

    }

    /*
    使用RandomAccessFile实现数据的插入效果
     */
    @Test
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");

        raf1.seek(3);
        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        // 保存指针3后面的所有数据到StringBuilder中
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));
        }
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        // 将StringBuilder中的数据写入到文件中
        raf1.write(builder.toString().getBytes());

        raf1.close();
    }



    // ByteArrayOutputStream方法
    @Test
    public void test4() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
        raf1.seek(3);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1){
            baos.write(buffer,0,len);
        }
        raf1.seek(3);
        raf1.write("xyz".getBytes());

        // 将StringBuilder中的数据写入到文件中
        raf1.write(baos.toString().getBytes());

        raf1.close();
    }
}
