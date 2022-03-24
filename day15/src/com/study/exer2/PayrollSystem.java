package com.study.exer2;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        // 方式一
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月月份：");
//        int month = scanner.nextInt();

        // 方式二
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;// 获取当前月份

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("马森",1002,new MyDate(2002,6,27),10000);
        emps[1] = new HourlyEmployee("朱俊钊",2001,new MyDate(2001,10,27),60,240);

        for (int i = 0;i < emps.length;i++){
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为：" + salary);

            if (month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐！奖励200rmb");
            }
        }
    }
}
