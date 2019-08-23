package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        String fileName = args[0];
        HashMap<Integer, Integer> letters = new HashMap<Integer, Integer>();
        BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(fileName));
        int c;

        while (f1.available()>0){
            c =  f1.read();
            if (!letters.keySet().contains(c)){
                letters.put(c, 1);
            }
            else letters.put(c, letters.get(c) + 1);
        }
        f1.close();

        ArrayList<Integer> keys = new ArrayList<Integer>();
        keys.addAll(letters.keySet());
        Collections.sort(keys);

        for (int i : keys){
            System.out.println((char) i + " " + letters.get(i));
        }
    }
}
