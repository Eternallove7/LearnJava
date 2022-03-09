package com.study;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "朱俊钊";
        stu1.age = 19;
        stu1.major = "Java开发";
        stu1.interests = "玩游戏";

        stu1.say();

        Teacher tea1 = new Teacher();
        tea1.name = "月半哥";
        tea1.age = 34;
        tea1.teachAge = 12;
        tea1.course = "计算机";

        tea1.say();
    }
}

class Student{
    String name;
    int age;
    String major;
    String interests;

    public void say(){
        System.out.println(name + age + "岁" + major + "专业" + interests + "兴趣爱好");
    }
}

class Teacher{
    String name;
    int age;
    int teachAge;
    String course;

    public void say(){
        System.out.println(name + age + "岁" + teachAge + "教龄" + course + "课程");
    }
}