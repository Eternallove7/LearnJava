package com.study.java2;

/**
 *
 * main()方法的使用说明：
 * 1.main()方法作为程序的入口
 * 2.main()方法也是一个普通的静态方法
 *
 */

public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}

class Main{
    public static void main(String[] args) {

        for (int i = 0;i < args.length;i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
