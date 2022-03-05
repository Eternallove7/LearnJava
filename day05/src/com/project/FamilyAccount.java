package com.project;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;

        // 用于记录用户的收入和支出
        String details = "收支\t账户金额\t收支金额\t说   明\n";

        // 初始金额
        int balance = 10000;

        while(isFlag){
            System.out.print("----------家庭收支记账软件-----------\n");
            System.out.print("            1.收支明细              \n");
            System.out.print("            2.登记收入              \n");
            System.out.print("            3.登记支出              \n");
            System.out.print("            4.退出                 \n");
            System.out.print("            请选择(1-4)：");

            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
                    System.out.println("---------当前收支明细记录--------");
                    System.out.println(details);
                    System.out.println("------------------------------") ;

                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();

                    // 处理余额
                    balance += money;

                    details += "收入" + "\t" + balance + "\t" + money + "\t" + info + "\n";

                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int out = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String outinfo = Utility.readString();

                    if(balance >= out){
                        balance -= out;
                        details += "支出" + "\t" + balance + "\t" + out + "\t" + outinfo + "\n";
                    } else {
                        System.out.println("支出超出额度，支付失败！");
                    }

                    System.out.println("---------登记完成--------\n");
                    break;

                case '4':
                    // System.out.println("4.退出");
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }

            // isFlag = false;
        }
    }
}
