package com.free.java;


import java.util.Scanner;

/**收支记账
 * @author free
 * @create 2023-04-21-21:04
 */
public class xm {
    public static void main(String[] args) {
        String details="收支\t账户金额\t收支金额\t说明\n";
        //初始金额
        int balance=10000;
        //循环条件，用于不停显示菜单，退出时结束循环
        boolean loopFlag=true;
        do{
            System.out.println("\n---收支记账软件---\n");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出\n");
            System.out.println("请选择(1-4):");
            char selection=readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("当前收支明细记录");
                    System.out.println(details);
                    break;
                case '2':
                    System.out.println("本次收入金额：");
                    int money=readNumber();
                    System.out.println("本次收入说明：");
                    String info=readString();
                    balance+=money;
                    details+="收入\t"+balance+"\t"+money+"\t\t"+info+"\n";
                    System.out.println("登记完成");
                    break;
                case '3':
                    System.out.println("本次支出金额：");
                    int pay=readNumber();
                    System.out.println("本次支出说明：");
                    String payInfo=readString();
                    if(balance>=pay){
                        balance-=pay;
                        details+="支出\t"+balance+"\t"+pay+"\t\t"+payInfo+"\n";
                        System.out.println("登记完成");
                    }else {
                        System.out.println("支出超过账户额度，支付失败");
                    }

                    break;
                case '4':
                    System.out.println("确认是否退出(y/n):");
                    char isExit=readConfirmSelction();
                    if(isExit=='Y'){
                        loopFlag=false;
                    }
                    break;

            }


        }while (loopFlag);

    }

    //用户选择菜单，返回用户的选择
    public static char readMenuSelection(){
        char c;
        for (;;) {
            String str=readKeyBoard(1);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.println("选择错误，请重新输入：");
            }else break;
        }
        return c;
    }

    //读取用户输入的数字，限制长度为4
    public static int readNumber(){
        int n;
        for(;;){
            String str=readKeyBoard(4);
            try{
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    //读取用户输入的字符串
    public static String readString(){
        String str=readKeyBoard(8);
        return str;
    }


    //读取用户输入的确认信息，只包含大小写的y和n
    public static char readConfirmSelction(){
        char c;
        for(;;){
            String str=readKeyBoard(1).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N'){
                break;
            }else {
                System.out.println("选择错误，请重新输入：");
            }
        }
        return  c;
    }
    //返回用户输入的字符串，参数i为需要返回的字符长度
    public static String readKeyBoard(int i) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.length()<=i){
            return str;
        }
        return str.substring(0,i);
    }
}
