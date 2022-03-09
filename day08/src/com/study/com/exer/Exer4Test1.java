package com.study.com.exer;

public class Exer4Test1 {
    public static void main(String[] args) {
        // 声明Student类型的数组
        Student1[] stus = new Student1[20];
        Exer4Test1 test = new Exer4Test1();

        for (int i = 0;i < stus.length;i++){
            // 给数组元素赋值
            stus[i] = new Student1();
            // 给Student对象的属性赋值
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random() * (100 + 1));
        }

        test.print(stus);
        System.out.println("++++++++++++++++++++++++++++++");
        test.searchState(stus,3);
        System.out.println("++++++++++++++++++++++++++++++");
        test.sort(stus);
    }


    // 遍历Student1[]数组的操作
    public void print(Student1[] stus){
        for (int i = 0;i < stus.length;i++){
            System.out.println(stus[i].info());
        }
    }

    /**
     *
     * @param stus 要查找的数组
     * @param state 要查找的年级
     */

    public void searchState(Student1[] stus,int state){
        for (int i = 0;i < stus.length;i++){
            if(stus[i].state == 3){
                System.out.println(stus[i].info());
            }
        }
    }

    /**
     *
     * @param stus 要排序的数组
     */
    public void sort(Student1[] stus){
        for (int i = 0;i < stus.length - 1;i++){
            for (int j = 0;j < stus.length - 1 - i;j++){
                if (stus[j].score > stus[j + 1].score){
                    int temp = stus[j].score;
                    stus[j].score = stus[j + 1].score;
                    stus[j + 1].score = temp;
                }
            }
        }
        print(stus);
    }
}

class Student1{
    int number;
    int state;
    int score;

    // 显示学生信息的方法
    public String info(){
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }

}
