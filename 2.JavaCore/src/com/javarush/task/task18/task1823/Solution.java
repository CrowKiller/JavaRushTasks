package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            if (name.equals("exit")) break;
            else
                new ReadThread(name).start();
        }

    }

    public static class ReadThread extends Thread {

        private String fileName1;

        public ReadThread(String fileName) {
            //implement constructor body
            fileName1 = fileName;
            // start();
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {

            HashMap<Integer, Integer> bytes = new HashMap<Integer, Integer>();
            try {
                FileInputStream fis = new FileInputStream(fileName1);
                while (fis.available() > 0) {
                    int buf = fis.read();
                    if (bytes.keySet().contains(buf))
                        bytes.put(buf, bytes.get(buf) + 1);
                    else bytes.put(buf, 1);
                }
                fis.close();
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }


            Set<Map.Entry<Integer, Integer>> entries = bytes.entrySet();
            resultMap.put(fileName1, Collections.max(entries, Comparator.comparing(Map.Entry<Integer, Integer>::getValue)).getKey());
         //   System.out.println("Ver1 " + fileName1 + " " + Collections.max(entries, (Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) -> entry1.getValue() - entry2.getValue()).getKey());
         //   System.out.println("ver2 " + fileName1 + " " + Collections.max(entries, Comparator.comparing(Map.Entry<Integer, Integer>::getValue)).getKey());
        }
    }
}
