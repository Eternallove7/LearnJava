package com.study.java1;

import java.io.Serializable;

/**
 * @author RenAshbell
 * @create 2022-04-13-14:38
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
