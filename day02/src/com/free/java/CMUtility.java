package com.free.java;

import java.util.Scanner;

/**
 * @author free
 * @create 2023-04-23-14:43
 */
public class CMUtility {
    private static Scanner scanner=new Scanner(System.in);

    //用户选择菜单，返回用户的选择
    public static char readMenuSelection(){
        char c;
        for (;;) {
            String str=readKeyBoard(1,false);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'){
                System.out.println("选择错误，请重新输入：");
            }else break;
        }
        return c;
    }

    //读取用户输入的一个字符
    public static String readChar(){
        String str=readKeyBoard(1,false);
        return str;
    }

    //读取用户输入的一个字符,如果用户不输入，使用默认值
    public static String readChar(String defaultValue){
        String str=readKeyBoard(1,true);
        return (str.length()==0)?defaultValue:str;
    }


    //读取用户输入的数字，限制长度为2
    public static int readNumber(){
        int n;
        for(;;){
            String str=readKeyBoard(2,false);
            try{
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    //读取用户输入的数字，限制长度为2,用户不输入时，使用默认值
    public static int readNumber(int defaultValue){
        int n;
        for(;;){
            String str=readKeyBoard(2,true);
            if("".equals(str)){
                return defaultValue;
            }
            try{
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入错误，请重新输入：");
            }
        }
        return n;
    }
    //读取用户输入的字符串,参数limit为限制的长度
    public static String readString(int limit){
        String str=readKeyBoard(limit,false);
        return str;
    }

    //读取用户输入的字符串,参数limit为限制的长度,用户不输入时，使用默认值
    public static String readString(int limit,String defaultValue){
        String str=readKeyBoard(limit,true);
        return "".equals(str)?defaultValue:str;
    }

    //读取用户输入的确认信息，只包含大小写的y和n
    public static char readConfirmSelction(){
        char c;
        for(;;){
            String str=readKeyBoard(1,false).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N'){
                break;
            }else {
                System.out.println("选择错误，请重新输入：");
            }
        }
        return  c;
    }
    //返回用户输入的字符串，参数i为需要返回的字符长度,参数blank为是否输入可以为空
    public static String readKeyBoard(int i,boolean blankReturn) {
        String line="";
        while (scanner.hasNextLine()){
            line=scanner.nextLine();
            if(line.length()==0){
                if(blankReturn)return line;
                else continue;
            }
            if(line.length()<1||line.length()>i){
                System.out.println("输入长度(不大于"+i+")错误，请重新输入");
                continue;
            }
            break;
        }
        return line;
    }
}
