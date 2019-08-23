package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;


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
      //  String alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        int letterCounter = 0;
        try {
            while (fis.available() > 0) {
                int c =  fis.read();
                if ((c >= 97 && c <= 122) || ((c>=65 && c<=90))){
                letterCounter++;
                }
              //  if (alphabet.contains(String.valueOf(buf)))  letterCounter++;
            }
            fis.close();
        }
        catch (IOException e){
            //System.exit(0);
            }

        System.out.println(letterCounter);
    }
}
