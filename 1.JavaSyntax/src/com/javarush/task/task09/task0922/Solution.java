package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        SimpleDateFormat df2 = new SimpleDateFormat("MMM d, yyyy", Locale.US);
        Date date = df1.parse(reader.readLine());
    //    String outDate = df2.format(date);
      //  outDate = outDate.t

        //df2.toString()
        System.out.println(df2.format(date).toUpperCase());

    }
}
