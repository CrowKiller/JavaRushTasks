package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buf=Integer.parseInt(reader.readLine());
        int result = buf;
        while (buf!=-1) {
            buf=Integer.parseInt(reader.readLine());
            result+=buf;
        }
        System.out.println(result);
    }
}
