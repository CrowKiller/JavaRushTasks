package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fs1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream fs2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        ArrayList<Byte> list = new ArrayList<Byte>();
        while (fs1.available()>0){
            list.add(0, ((byte) fs1.read()));
        }
        fs1.close();
        for (byte b : list){
            fs2.write(b);
        }
        fs2.close();
    }
}
