package com.free.java;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 * 输入输出流
 *
 * @author free
 * @create 2022-12-28-16:50
 */
public class FileReaderWriterTest {
    @Test
    public void testFileReader() {
        //读入的文件一定要存在
        File file = new File("hello.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //返回读入的一个字符，如果达到文件末尾，返回-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void testFileReader1() {
        //读入的文件一定要存在
        File file = new File("hello.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] chars=new char[5];
            //返回读入的一个字符，如果达到文件末尾，返回-1
            //最后一次如果没有读满，后面的数据会保留上一次读取的。
            int len;
            while ((len=fr.read(chars)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(chars[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void testFileWriter() throws IOException {
        File file = new File("hello.txt");
        FileWriter writer=new FileWriter(file,true);
        writer.write("dream\n");
        writer.write("you and me\n");
        writer.close();
    }
    @Test
    public void testBuffer(){
        File file=new File("hello.txt");
        FileReader fr=null;
        BufferedReader bufferedReader=null;
        ArrayList list=new ArrayList();
        try {
            fr=new FileReader(file);
            bufferedReader=new BufferedReader(fr);
            String data=bufferedReader.readLine();
            while (data!=null){
                list.add(data);
                System.out.println(data);
                data=bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(bufferedReader!=null){
                    bufferedReader.close();
                }
                if(fr!=null){
                    fr.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //list.forEach(System.out::println);
    }



}
