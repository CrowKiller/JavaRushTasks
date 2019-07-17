package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max=0;
        while (fs.available()>0){
            int buf = fs.read();
            if (buf>max) max=buf;
        }
        fs.close();
        System.out.println(max);
    }
}
