package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        //s = " ";

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int out = array.length - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){//Внутренний цикл
                int count = 1;
                if (isNumber(array[in]))
                    while ((in + count)<(array.length - 1) && !isNumber(array[in+count])) count++;

                if (isNumber(array[in]) && isNumber(array[in + count]) && (Integer.parseInt(array[in + count]) > Integer.parseInt(array[in]))/*isGreaterThan(array[in + count], array[in])*/) {            //Если порядок элементов нарушен
                    //toSwap(in, in + 1);             //вызвать метод, меняющий местами
                    String buf = array[in];
                    array[in] = array[in+count];
                    array[in+count] = buf;
                }
            }
        }


        for (int out = array.length - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){//Внутренний цикл
                int count = 1;
                if (!isNumber(array[in]))
                    while ((in + count)<(array.length - 1) && isNumber(array[in+count])) count++;

                if (!isNumber(array[in]) && !isNumber(array[in + count]) && isGreaterThan(array[in], array[in + count])) {            //Если порядок элементов нарушен
                    //toSwap(in, in + 1);             //вызвать метод, меняющий местами
                    String buf = array[in];
                    array[in] = array[in+count];
                    array[in+count] = buf;
                }
            }
        }
    }



    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
