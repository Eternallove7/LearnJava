package com.study.exer4;

public class Account {

    private int balance;

    public Account(){

    }

    public Account(int init_balanc){
        this.balance = init_balanc;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");
        } else {
            System.out.println("取钱失败");
        }
    }
}
