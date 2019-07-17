package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList a = new ArrayList();
        for (int i = 0; i < 5; i++) {
            a.add(Integer.parseInt(reader.readLine()));
        }
        int i=0;
        int buf, swap_cnt=0;
        while (i<5){
            if (i+1 != 5 && (Integer)a.get(i) > (Integer)a.get(i+1)) {
                buf = (Integer) a.get(i);
                a.set(i, a.get(i+1));
               // array[i] = array[i + 1];
                //array[i + 1] = buf;
                a.set(i+1, buf);
                swap_cnt = 1;
            }
            i++;
            if (i==5 && swap_cnt==1){
                swap_cnt=0;
                i=0;
            }
        }
        a.forEach(System.out::println);
    }
}
