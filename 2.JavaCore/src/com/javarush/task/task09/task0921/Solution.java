package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true)   arr.add(Integer.parseInt(reader.readLine()));
        }
        catch (NumberFormatException e) {
            for (Integer i : arr) {
                System.out.println(i);
            }
        }
        catch (IOException e){
            System.out.println("Ошибка ввода");
        }
    }
}
