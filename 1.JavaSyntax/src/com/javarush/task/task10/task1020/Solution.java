package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.lang.reflect.Array;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int out = array.length - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(array[in] > array[in + 1]) {           //Если порядок элементов нарушен
                    //toSwap(in, in + 1);//вызвать метод, меняющий местами
                    int buff = array[in];
                    array[in] = array[in+1];
                    array[in+1] = buff;
                }
            }
        }
    }
}

