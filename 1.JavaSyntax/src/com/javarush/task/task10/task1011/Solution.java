package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < 40; i++) {
            char[] str = s.toCharArray();
            for (int j = i; j < str.length; j++) {
                System.out.print(str[j]);
            }
            System.out.println();
        }
        //напишите тут ваш код
    }

}

