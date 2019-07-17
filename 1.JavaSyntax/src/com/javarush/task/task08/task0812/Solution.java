package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int buf=list.get(0), max = 1, bufMax = 1;
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i) == buf) bufMax++;
            else {
                if (bufMax>max) max = bufMax;
                buf = list.get(i);
                bufMax=1;
            }
        }
        if (bufMax>max) max = bufMax;
        System.out.println(max);
    }
}