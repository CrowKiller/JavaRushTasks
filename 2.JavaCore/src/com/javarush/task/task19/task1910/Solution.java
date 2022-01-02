package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()))
        ) {
            while (fileReader.ready()) {
                char c = (char) fileReader.read();
                if (String.valueOf(c).matches("[\\p{Punct}\\n]")) {
                    continue;
                }
                fileWriter.write(c);
            }
        } catch (IOException e) {

        }
    }
}
