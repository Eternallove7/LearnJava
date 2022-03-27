package com.study.java1;

import java.awt.*;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，可以考虑使用当前类充当同步监视器
 *
 *
 *
 * @author RenAshbell
 * @create 2022-03-27-10:52
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window2 extends Thread{
    private static Object o = new Object();
    private static int TICKET = 1000;

    @Override
    public void run() {
        while (true){
            // 正确的
//            synchronized (o) {
            synchronized (Window.class) {// Class clazz = Window.class 只会加载一次
            // 错误的：this代表这t1，t2，t3三个对象
//            synchronized (this) {
                if (TICKET > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ":卖票，票号为：" + TICKET);

                    TICKET--;
                } else {
                    break;
                }
            }
        }

    }
}