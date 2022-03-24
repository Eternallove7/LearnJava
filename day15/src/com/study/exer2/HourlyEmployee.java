package com.study.exer2;

public class HourlyEmployee extends Employee{
    private int wege;// 每小时的工资
    private int hour;// 月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday,int wege,int hour) {
        super(name, number, birthday);
        this.wege = wege;
        this.hour = hour;
    }

    public int getWege() {
        return wege;
    }

    public void setWege(int wege) {
        this.wege = wege;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wege * hour;
    }

    public String toString(){
        return "HourlyEmployee{" + super.toString() + "}";
    }
}
