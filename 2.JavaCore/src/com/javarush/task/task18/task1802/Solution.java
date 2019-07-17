package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min=fs.read();
        while (fs.available()>0){
            int buf = fs.read();
            if (buf<min) min=buf;
        }
        fs.close();
        System.out.println(min);
    }
}
