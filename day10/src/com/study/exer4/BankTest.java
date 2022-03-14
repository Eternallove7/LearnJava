package com.study.exer4;

import com.study.exer3.Account;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane","Smith");

        bank.getCustomer(0).setAccount(new Account(1000));
    }
}
