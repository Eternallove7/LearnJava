package com.project;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
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
                    System.out.println("1.收支明细");
                    break;
                case '2':
                    System.out.println("2.登记收入");
                    break;
                case '3':
                    System.out.println("3.登记支出");
                    break;
                case '4':
                    System.out.println("4.退出");
                    break;
            }

            // isFlag = false;
        }
    }
}
