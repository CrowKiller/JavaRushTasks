package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (fs.available()>0){
            int buf = fs.read();
            if (map.containsKey(buf)) map.put(buf, map.get(buf)+1);
            else map.put(buf, 1);
        }
        fs.close();

        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue()==max) System.out.print(entry.getKey()+ " ");
        }
    }
}
