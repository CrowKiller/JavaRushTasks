package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
      for (int i = 0; i < list.size(); ) {
              if (!list.get(i).contains("р")&& !list.get(i).contains("л") || (list.get(i).contains("р")&& list.get(i).contains("л"))){
                i++;
                continue;
            }
            else if (list.get(i).contains("р")) {
                list.remove(i);
                continue;
            }
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i+=2;
            }
       // if (list.get(i).contains("р")) System.out.println(list.get(i) + " содержит букву р");
        //if (list.get(i).contains("р")) System.out.println(list.get(i) + " содержит букву р");
        }
        return list;
    }
}