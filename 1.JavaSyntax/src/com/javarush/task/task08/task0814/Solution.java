package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        set.removeIf(x -> x>10);
     /*   Iterator<Integer> iter = set.iterator();
        for (int i: iter.
             ) {

        }*/

        return set;
    }

    public static void main(String[] args) {

      /*  HashSet<Integer> set = removeAllNumbersGreaterThan10(createSet());
        for (int i : set
             ) {
            System.out.println(i);
        }*/

    }
}
