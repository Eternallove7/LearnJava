package com.study.java1;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 * @author RenAshbell
 * @create 2022-03-27-19:54
 */
public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window4 extends Thread{
    private static int TICKET = 1000;

    @Override
    public void run() {
        while (TICKET > 0){
            show();
        }

    }

    private static synchronized void show(){// 同步监视器：Window4.class
//    private synchronized void show(){// 同步监视器：t1,t2,t3
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