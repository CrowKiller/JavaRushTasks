package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        BufferedOutputStream f2 = new BufferedOutputStream(new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));

        Scanner scanner = new Scanner(f1);
        char buf = '0';
        String bufString = "";
        float result;
//        while (f1.available() > 0) {
//            while (f1.available() > 0) {
//                buf = (char) f1.read();
//                if (buf == ' ') break;
//                bufString = bufString + buf;
//            }
//
//            if (!bufString.equals("")) {
//                result = Float.parseFloat(bufString);
//                f2.write(Integer.toString(Math.round(result)).getBytes());
//                bufString = "";
//                f2.write(' ');
//            }
//        }

        String[] line = null;
        while (scanner.hasNext()) {
            //result = scanner.nextFloat();
            line = scanner.nextLine().split(" ");
            for (String s : line) {
                f2.write(Integer.toString(Math.round(Float.parseFloat(s))).getBytes());
                f2.write(' ');
            }
        }
        f1.close();
        f2.close();

    }
}
