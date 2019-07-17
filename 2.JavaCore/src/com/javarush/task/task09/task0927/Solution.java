package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        String s = "Сеня";
        map.put(s, new Cat(s));

        s = "Вася";
        map.put(s, new Cat(s));

        s = "Котя";
        map.put(s, new Cat(s));

        s = "Барсик";
        map.put(s, new Cat(s));

        s = "лох";
        map.put(s, new Cat(s));

        s = "Сима";
        map.put(s, new Cat(s));

        s = "Мурка";
        map.put(s, new Cat(s));

        s = "Кошка";
        map.put(s, new Cat(s));

        s = "Шельма";
        map.put(s, new Cat(s));

        s = "Стас";
        map.put(s, new Cat(s));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<Cat>(map.values());

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
