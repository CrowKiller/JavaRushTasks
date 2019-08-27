package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{

        int key = 64589;
        if (args[0].equals("-e")){
            encrypt(args[1], args[2], key);
    }
        else if (args[0].equals("-d")){
            decrypt(args[1],args[2], key);
        }


    }


    public static void encrypt(String input, String output, int key) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        while (reader.ready()){
            char buf = (char) reader.read();
            buf = (char) ((buf + key)% 65536);
            writer.write(buf);
        }

        reader.close();
        writer.close();
    }



    public static void decrypt(String input, String output, int key) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        while (reader.ready()){
            char buf = (char) reader.read();
            buf = (char) ((buf - key)% 65536);
            writer.write(buf);
        }

        reader.close();
        writer.close();
    }

}
