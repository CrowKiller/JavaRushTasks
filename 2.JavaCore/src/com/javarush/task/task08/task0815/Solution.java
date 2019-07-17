package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Галушка", "Роман");
        map.put("Галушка1", "Сергей");
        map.put("Галушка2", "Валентина");
        map.put("Галушка3", "Андрей");
        map.put("Петров1", "Андрей");
        map.put("Петров2", "Роман");
        map.put("Петров3", "Роман");
        map.put("Иванов", "Юрий");
        map.put("Попов", "Николай");
        map.put("Петров", "Сергей");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s: map.values()
             ) {
            if (s.equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        if (map.keySet().contains(lastName)) return 1;

        return 0;
    }

    public static void main(String[] args) {

        HashMap<String, String> map = createMap();

        return;
    }
}
