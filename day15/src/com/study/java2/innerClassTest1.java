package com.study.java2;


public class innerClassTest1 {

    // 开发中很少见
    public void method(){
        // 局部内部类
        class AA{

        }
    }

    public Comparable getComparable(){

        // 创建一个实现了Comparable接口的类：局部内部类
        // 方式一
//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo(Object o){
//                return 0;
//            }
//        }
//        return new MyComparable();

        // 方式二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }


}
