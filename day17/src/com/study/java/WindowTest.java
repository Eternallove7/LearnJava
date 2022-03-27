package com.study.java;

/**
 * 例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 *
 * 有线程安全问题，待解决
 *
 * @author RenAshbell
 * @create 2022-03-27-10:52
 */
public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window extends Thread{
    Object o = new Object();
    private static int TICKET = 100;
    @Override
    public void run() {

        while (true){
            if (TICKET > 0) {
                try {
                    Thread.sleep(100);
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