package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int a,b,c;
        a = number % 10;
        //   System.out.println("a=" + a);
        b = number / 10 % 10;
        //   System.out.println("b=" + b);
        c = number / 100 % 10;
        //   System.out.println("c=" + c);
        return a + b + c;
        }
    }