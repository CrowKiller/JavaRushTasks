package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int buf = Integer.parseInt(reader.readLine());
        int maximum = buf;
        for (int i = 1; i < count; i++) {
            buf = Integer.parseInt(reader.readLine());
            maximum = buf>maximum ? buf : maximum;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
