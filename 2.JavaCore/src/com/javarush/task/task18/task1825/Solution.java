package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String buf = null;
            buf = reader.readLine();
            if (buf.equals("end")) break;
            else
                list.add(buf);
        }

        Collections.sort(list, (String o1, String o2) -> Integer.parseInt(o1.substring(o1.lastIndexOf("part") + 4)) - Integer.parseInt(o2.substring(o2.lastIndexOf("part") + 4)));

        String fileName = list.get(0).substring(0, list.get(0).lastIndexOf(".part"));
        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(fileName));

        for (String s : list) {
            BufferedReader input = null;
            input = new BufferedReader(new FileReader(s));

            while (input.ready()) {
//                char[] buffer = new char[1024];
//                input.read(buffer);
//                output.write(buffer);
                output.write(input.read());
            }
            input.close();
        }
        output.close();
    }
}
