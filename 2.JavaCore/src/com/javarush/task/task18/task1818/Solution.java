package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception{

      //  BufferedInputStream reader = new
        BufferedOutputStream f1 = new BufferedOutputStream(new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        BufferedInputStream f2 = new BufferedInputStream(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        BufferedInputStream f3 = new BufferedInputStream(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));

        Date t1 = new Date();
        while (f2.available()>0){
            f1.write(f2.read());
        }

        f2.close();

        while (f3.available()>0){
            f1.write(f3.read());
        }
        f3.close();
        f1.close();
        Date t2 = new Date();
        System.out.println(t2.getTime()-t1.getTime());
    }
}
