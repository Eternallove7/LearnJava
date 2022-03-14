package com.study.java;

public class OrderTest {
    int orderDefault;
    public int orderPublic;
    private int orderPrivate;

    void methodDeault(){
        orderDefault = 1;
        orderPublic = 2;
        orderPrivate = 3;
    }

    public void methodPublic(){
        orderDefault = 1;
        orderPublic = 2;
        orderPrivate = 3;
    }

    private void methodPrivate(){
        orderDefault = 1;
        orderPublic = 2;
        orderPrivate = 3;
    }
}
