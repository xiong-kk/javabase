package com.free.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author free
 * @create 2022-12-24-13:41
 */
public class DateTimeTest {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        String str="20-9-18 下午2:33";
        Date date1=sdf.parse(str);
        System.out.println(date1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
        String format1=sdf2.format(date);
        System.out.println(format1);

    }

    @Test
    public void test1() throws ParseException {
        String birth="2020-9-08";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        System.out.println(date);
        java.sql.Date birthDate=new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
}
