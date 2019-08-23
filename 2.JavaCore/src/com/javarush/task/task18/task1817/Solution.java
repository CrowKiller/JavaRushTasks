package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e){
         //   System.exit(0);
        }
        int letterCounter = 0;
        int spaceCounter = 0;
        try {
            while (fis.available() > 0) {
                int c =  fis.read();
                if ((c == (int)' ')){
                    spaceCounter++;
                }
                letterCounter++;
                //  if (alphabet.contains(String.valueOf(buf)))  letterCounter++;
            }
            fis.close();
        }
        catch (IOException e){
            //System.exit(0);
        }

        float resul = (float) spaceCounter/letterCounter*100;

        System.out.printf("%.2f", resul);
    }
}
