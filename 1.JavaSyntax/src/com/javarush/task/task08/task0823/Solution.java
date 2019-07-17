package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //char size =
        for (int i = 0; i < s.length()-1; ) {
            while (Character.isSpaceChar(s.charAt(i)) && i < s.length()-1) i++;
            s= s.substring(0, i) + Character.toUpperCase(s.charAt(i)) + s.substring(i+1);
            while (!Character.isSpaceChar(s.charAt(i)) && i < s.length()-1) i++;
        }

        System.out.println(s);

        //напишите тут ваш код
    }
}
