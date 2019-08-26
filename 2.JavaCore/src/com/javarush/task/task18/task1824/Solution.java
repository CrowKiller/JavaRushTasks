package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import javax.imageio.IIOException;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        while (true) {
            String name = null;


            try {
                name = new BufferedReader(new InputStreamReader(System.in)).readLine();
            }
            catch (IOException e){};


            try {
                new FileInputStream(name).close();

            } catch (FileNotFoundException e) {
                System.out.println(name);
                break;
            }
            catch (IOException e){}
        }
    }
}