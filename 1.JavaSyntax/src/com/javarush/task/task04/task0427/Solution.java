package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>=1 && a<=999) {
            if (a%2==0) System.out.print("четное");
            else System.out.print("нечетное");
            System.out.print(" ");
            if (a<10) System.out.print("однозначное");
            else
            if (a<100) System.out.print("двузначное");
            else System.out.print("трехзначное");
            System.out.println(" число");
        }
    }
}
