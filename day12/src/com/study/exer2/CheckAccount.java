package com.study.exer2;

public class CheckAccount extends Account{

    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount){
            // 方式一
//            setBalance(getBalance() - amount);

            // 方拾二
            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()){// 透支额度+余额足够消费
            overdraft -= (amount - getBalance());
            // 把余额清零
            super.withdraw(getBalance());
        } else {
            System.out.println("超过可透支限额！");
        }
    }
}
