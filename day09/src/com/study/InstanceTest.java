package com.study;

/**
 * 匿名对象的引用
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.sendEmail();
        p.playGame();

        // 匿名
        new Phone().sendEmail();
        new Phone().playGame();

        new Phone().price = 1999;
        new Phone().showprice();

        PhoneMall mail = new PhoneMall();
        // 匿名对象的使用
        mail.show(new Phone());
    }
}

class PhoneMall{

    public void show(Phone Phone){
        Phone.sendEmail();
        Phone.playGame();
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void showprice(){
        System.out.println("手机价格为：" + price);
    }
}
