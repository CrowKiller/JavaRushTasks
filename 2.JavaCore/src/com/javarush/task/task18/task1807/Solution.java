package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int counter = 0;
        while (fs.available() > 0) {
            int buf = fs.read();
            if (buf==',') counter++;
        }
        fs.close();
        System.out.println(counter);

    }
}
