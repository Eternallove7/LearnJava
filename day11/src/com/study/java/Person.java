package com.study.java;

public class Person {
    String name;
    int age;
    private String learn;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void setLearn(String learn){
        this.learn = learn;
    }

    public String getLearn(){
        return learn;
    }
}
