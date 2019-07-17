package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum=0, count=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buf = Integer.parseInt(reader.readLine());
        while (buf!=-1) {
            sum+=buf;
            count++;
            buf = Integer.parseInt(reader.readLine());
        }
        double avg = (double) sum/count;
        System.out.println(avg);
    }
}

