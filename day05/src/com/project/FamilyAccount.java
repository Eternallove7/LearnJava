package com.project;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;

        // ���ڼ�¼�û��������֧��
        String details = "��֧\t�˻����\t��֧���\t˵   ��\n";

        // ��ʼ���
        int balance = 10000;

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
                    System.out.println("---------��ǰ��֧��ϸ��¼--------");
                    System.out.println(details);
                    System.out.println("------------------------------") ;

                    break;
                case '2':
                    System.out.print("���������");
                    int money = Utility.readNumber();
                    System.out.print("��������˵����");
                    String info = Utility.readString();

                    // �������
                    balance += money;

                    details += "����" + "\t" + balance + "\t" + money + "\t" + info + "\n";

                    break;
                case '3':
                    System.out.print("����֧����");
                    int out = Utility.readNumber();
                    System.out.print("����֧��˵����");
                    String outinfo = Utility.readString();

                    if(balance >= out){
                        balance -= out;
                        details += "֧��" + "\t" + balance + "\t" + out + "\t" + outinfo + "\n";
                    } else {
                        System.out.println("֧��������ȣ�֧��ʧ�ܣ�");
                    }

                    System.out.println("---------�Ǽ����--------\n");
                    break;

                case '4':
                    // System.out.println("4.�˳�");
                    System.out.println("ȷ���Ƿ��˳�(Y/N)��");
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
