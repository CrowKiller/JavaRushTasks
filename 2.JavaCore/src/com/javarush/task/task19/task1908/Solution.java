package com.javarush.task.task19.task1908;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Выделяем числа
*/

public class Solution {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))
        ) {
            StringBuilder builder = new StringBuilder();
            while (fileReader.ready()) {
                char c = (char) fileReader.read();
                if (!fileReader.ready()) {
                    builder.append(c);
                }
                if (!fileReader.ready() || String.valueOf(c).matches("[\\s\\n]")) {
                    try {
                        fileWriter.write(Integer.parseInt(builder.toString().trim()) + " ");
                    } catch (NumberFormatException e) {
                        //skip
                    }
                    builder = new StringBuilder();
                    continue;
                }
                builder.append(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
