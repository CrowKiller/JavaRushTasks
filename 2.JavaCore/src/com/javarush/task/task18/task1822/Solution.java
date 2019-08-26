package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int id = Integer.parseInt(args[0]);
        BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        Scanner scanner = new Scanner(f1);
        //String string = null;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            if (Integer.parseInt(elements[0]) == id) {
                System.out.println(line);
                break;
            }
        }
        f1.close();

    }
}
