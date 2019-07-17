package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]>list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> a = new ArrayList<int[]>();
        int[] buf = {2,6,565, 85, 23};
        a.add(buf);
        buf = new int[]{8, 96};
        a.add(buf);
        buf = new int[]{89, 78, 9, 7};
        a.add(buf);
        buf = new int[]{741, 554, 96, 748, 66, 12, 852};
        a.add(buf);
        buf = new int[]{};
        a.add(buf);
        return a;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
