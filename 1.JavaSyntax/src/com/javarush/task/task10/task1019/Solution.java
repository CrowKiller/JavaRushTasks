package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
            String name = reader.readLine();
            if (name.equals("")) break;
            int id = Integer.parseInt(name);
            name = reader.readLine();
            map.put(name, id);
        }
        //System.out.println("Id=" + id + " Name=" + name);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String name = pair.getKey();
            int index = pair.getValue();
            System.out.println(index + " " + name);
        }
    }
}
