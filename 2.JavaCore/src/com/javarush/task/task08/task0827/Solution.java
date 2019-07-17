package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution  {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.US);
        Date a = df.parse(date);
        Date b = df.parse("JANUARY 1 2000");
        //b.setTime(0);
       // b.setHours(0); b.setMonth(1); b.setDate(0); b.setMinutes(0);
       // long a = date.
        b.setYear(a.getYear());
        long c= (a.getTime() - b.getTime()) / 1000/ 60/ 60/ 24;
      //  System.out.println(c);
        boolean result;
        if (c%2 == 0 ) result=true;
                else result=false;
        return result;
    }
}
