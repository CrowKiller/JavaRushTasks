package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

        return  map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
  /*      Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        //for (Map.Entry<String, String> entry : iterator)
        while (iterator.hasNext()){
            //Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
            Map.Entry<String, String> entry = iterator.next();
       //     Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator(iterator);
            while (iterator2.hasNext()){
                Map.Entry<String, String> entry2 = iterator2.next();
                if (entry.getValue().equals(entry2.getValue())) {
                    removeItemFromMapByValue(map, entry.getValue());
                    break;
                }
            }
        }*/

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
     //   Map<String, String> map = createMap();
     //   removeTheFirstNameDuplicates(map);

    }
}
