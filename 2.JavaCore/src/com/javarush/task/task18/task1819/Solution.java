package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception{

        String name1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String name2 = new BufferedReader(new InputStreamReader(System.in)).readLine();

        BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(name1));

     //   byte[] buffer = Files.readAllBytes(Paths.get(name1));

        byte[] buffer = new byte[f1.available()];

        while (f1.available()>0){
            buffer[buffer.length-f1.available()]= (byte) f1.read();
        }

        f1.close();

        BufferedOutputStream f2 = new BufferedOutputStream(new FileOutputStream(name1));
        BufferedInputStream f3 = new BufferedInputStream(new FileInputStream(name2));

        while (f3.available()>0){
            f2.write(f3.read());
        }
        f3.close();

        f2.write(buffer);
        f2.close();
    }
}
