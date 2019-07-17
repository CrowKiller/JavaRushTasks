package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fs2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fs3 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int size = fs1.available();

        while (fs1.available()>size/2){
            fs2.write(fs1.read());
        }
        fs2.close();

        while (fs1.available()>0){
            fs3.write(fs1.read());
        }
        fs3.close();
        fs1.close();
    }
}
