package com.study.java1;

/**
 * 例子：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 *
 * 关于同步方法的总结：
 * 1.同步方法仍然设计到同步监视器，只是不需要我们显示的声明。
 * 2.非静态的同步方法，同步监视器：this
 *   静态的同步方法，同步监视器是：当前类本身
 *
 * @author RenAshbell
 * @create 2022-03-27-11:21
 */
class Window3 implements Runnable{

    private int TICKET = 1000;

    @Override
    public void run() {
        while (TICKET > 0){
            show();
        }
    }

    public synchronized void show() {// 同步监视器：this
        if (TICKET > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + TICKET);
            TICKET--;
        }

    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

