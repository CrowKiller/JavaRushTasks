package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double a = Double.parseDouble(reader.readLine());
        a = a - 5*(a.intValue()/5);
        //System.out.println(a);
        if (a<3) System.out.println("зеленый");
        else if (a>=4) System.out.println("красный");
        else System.out.println("желтый");
    }
}