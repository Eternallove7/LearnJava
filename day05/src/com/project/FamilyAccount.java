package com.project;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        while(isFlag){
            System.out.print("----------��ͥ��֧�������-----------\n");
            System.out.print("            1.��֧��ϸ              \n");
            System.out.print("            2.�Ǽ�����              \n");
            System.out.print("            3.�Ǽ�֧��              \n");
            System.out.print("            4.�˳�                 \n");
            System.out.print("            ��ѡ��(1-4)��");

            char selection = Utility.readMenuSelection();

            switch (selection){
                case '1':
                    System.out.println("1.��֧��ϸ");
                    break;
                case '2':
                    System.out.println("2.�Ǽ�����");
                    break;
                case '3':
                    System.out.println("3.�Ǽ�֧��");
                    break;
                case '4':
                    System.out.println("4.�˳�");
                    break;
            }

            // isFlag = false;
        }
    }
}
