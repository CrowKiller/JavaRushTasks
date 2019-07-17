package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b3 = new ArrayList<Integer>();
        ArrayList<Integer> b2 = new ArrayList<Integer>();
        ArrayList<Integer> b1 = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer buf;

        for (int i = 0; i < 20; i++) {
            buf = Integer.parseInt(reader.readLine());
            a.add(buf);
            if (buf%3 != 0 && buf%2 != 0) b1.add(buf);
            else {
                if (buf%3==0) b3.add(buf);
                if (buf%2==0) b2.add(buf);
            }
        }

        printList(b3);
        printList(b2);
        printList(b1);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        list.forEach(System.out::println);

    }
}
