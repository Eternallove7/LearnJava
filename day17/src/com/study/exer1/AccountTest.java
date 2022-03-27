package com.study.exer1;

/**
 * 银行有一个账户。
 * 有两个储户分别向一个账户存3000元，每次存1000，存3次，每次存完打印账户余额。
 *
 * @author RenAshbell
 * @create 2022-03-27-21:31
 */
class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    // 存钱
    public synchronized void deposit(double amt){
        if (amt > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amt;
            System.out.println(Thread.currentThread().getName() + ":" + "存钱成功，余额为：" + balance);
        }
    }
}

//class Customer extends Thread{
//    private Account acct;
//
//    public Customer(Account acct){
//        this.acct = acct;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 3; i++) {
//            acct.deposit(1000);
//        }
//    }
//}
//
//public class AccountTest {
//    public static void main(String[] args) {
//        Account acct = new Account(0);
//
//
//        Customer c1 = new Customer(acct);
//        Customer c2 = new Customer(acct);
//
//        c1.setName("甲");
//        c2.setName("乙");
//
//        c1.start();
//        c2.start();
//    }
//}

class Customer implements Runnable{
    private Account acct;

    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);


        Thread t1 = new Thread(new Customer(acct));
        Thread t2 = new Thread(new Customer(acct));

        t1.setName("甲");
        t2.setName("乙");

        t1.start();
        t2.start();
    }
}