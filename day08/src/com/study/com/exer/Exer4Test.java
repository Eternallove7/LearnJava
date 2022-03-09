package com.study.com.exer;

public class Exer4Test {
    public static void main(String[] args) {
        // 声明Student类型的数组
        Student[] stus = new Student[20];
        for (int i = 0;i < stus.length;i++){
            // 给数组元素赋值
            stus[i] = new Student();
            // 给Student对象的属性赋值
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random() * (100 + 1));
        }

        for (int i = 0;i < stus.length;i++){
//            System.out.println(stus[i].number + "," + stus[i].state + "," + stus[i].score);
            System.out.println(stus[i].info());
        }
        System.out.println();

        for (int i = 0;i < stus.length;i++){
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }

        for (int i = 0;i < stus.length - 1;i++){
            for (int j = 0;j < stus.length - 1 - i;j++){
                if (stus[j].score > stus[j + 1].score){
                    int temp = stus[j].score;
                    stus[j].score = stus[j + 1].score;
                    stus[j + 1].score = temp;
                }
            }
        }
        System.out.println();

        for (int i = 0;i < stus.length;i++){
//            System.out.println(stus[i].number + "," + stus[i].state + "," + stus[i].score);
            System.out.println(stus[i].info());
        }
    }
}

class Student{
    int number;
    int state;
    int score;

    // 显示学生信息的方法
    public String info(){
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }

}
