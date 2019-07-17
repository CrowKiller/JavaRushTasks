package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.put(abcArray[i], 0);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

/*
        Iterator<Map.Entry<Character, Integer>> it = alphabet.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Character, Integer> entr = it.next();

        }*/

        for (String s :list ) {
            char[] str = s.toCharArray();
            for (char c : str){
                if (alphabet.containsKey(c))
                alphabet.put(c, alphabet.get(c) + 1 );
            }
        }
        // напишите тут ваш код

        for (int i = 0 ; i<abcArray.length ; i++){
            System.out.println(abcArray[i] + " " + alphabet.get(abcArray[i]));
        }
    }

}
