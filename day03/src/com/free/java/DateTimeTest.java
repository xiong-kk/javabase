package com.free.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * @author free
 * @create 2022-12-24-13:41
 */
public class DateTimeTest {
    @Test
    public void test(){
        //时间戳
        long time=System.currentTimeMillis();
        System.out.println(time);
    }


    @Test
    public void test1(){
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        Date date2 = new Date(1730901189401L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1730901189401L);
        System.out.println(date3);
    }

    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        String str="24-9-18 下午2:33";
        Date date1=sdf.parse(str);
        System.out.println(date1);

        //指定方式格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
        String format1=sdf2.format(date);
        System.out.println(format1);

    }

    @Test
    public void test3() throws ParseException {
        String birth="2020-9-08";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        System.out.println(date);
        java.sql.Date birthDate=new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    //Calendar日历类
    @Test
    public void test4(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());

        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        calendar.add(Calendar.DAY_OF_MONTH,3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        Date date = calendar.getTime();
        System.out.println(date);

        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);


    }

    @Test
    public void test5(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 10, 20);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMonth());

        //设置时间时原来的时间不会改变，体现不可变性
        LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(7);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.plusMonths(1);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(1);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);


    }

    @Test
    public void test6(){
        //获取本初子午线的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);

        //添加时区的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long l = instant.toEpochMilli();
        System.out.println(l);

        Instant instant1 = Instant.ofEpochMilli(1730904298391L);
        System.out.println(instant1);
    }

    @Test
    public void test7(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.now();
        String s1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(s1);

        TemporalAccessor temporalAccessor = formatter.parse("2024-11-06T22:51:22.464");
        System.out.println(temporalAccessor);


        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String s2 = formatter1.format(localDateTime);
        System.out.println(s2);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s3 = formatter2.format(localDateTime);
        System.out.println(s3);

        TemporalAccessor parse = formatter2.parse("2024-11-06 10:59:06");
        System.out.println(parse);
    }
}
