package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultOut = System.out;
        ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(defaultOut);

        System.out.println(result.replaceFirst("\n", "") + calculate(result));
    }

    public static int calculate(String s) {
        String pattern = "(?<a>\\d+) (?<operation>[\\+\\-\\*]) (?<b>\\d+) = ";
        Matcher matcher = Pattern.compile(pattern).matcher(s);
        if (!matcher.find()) {
            throw new RuntimeException("string doesn't matches pattern: " + pattern);
        }
        int a = Integer.parseInt(matcher.group("a"));
        int b = Integer.parseInt(matcher.group("b"));

        switch (matcher.group("operation")) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
        }
        return 0;

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

