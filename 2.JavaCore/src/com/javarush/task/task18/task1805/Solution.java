package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
       // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (fs.available()>0){
            int buf = fs.read();
            if (!list.contains(buf)) list.add(buf);
        }
        fs.close();

        Collections.sort(list);

        for (Integer i : list){
            System.out.print(i + " ");
        }
    }
}
