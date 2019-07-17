package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.US);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Kobeyn", df.parse("MAY 1 1980"));
        map.put("Skywalker", df.parse("JULY 1 1980"));
        map.put("Lol", df.parse("JUNE 1 1980"));
        map.put("Kek", df.parse("APRIL 1 1980"));
        map.put("Lil peep", df.parse("SEPTEMBER 1 1980"));
        map.put("Shinoda", df.parse("MARCH 1 1980"));
        map.put("Bennet", df.parse("AUGUST 1 1980"));
        map.put("Metal", df.parse("FEBRUARY 1 1980"));
        map.put("Pitt", df.parse("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
      //  Date date = new Date();
      //  int a = date.getMonth();
       // for (Map.Entry<String, Date> value : map.entrySet()){
      //      if (value.getValue().getMonth() >= 5 && value.getValue().getMonth()<=7) map.remove(value.getKey());
     //   }

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> val = iterator.next();

            if (val.getValue().getMonth() >= 5 && val.getValue().getMonth() <= 7) iterator.remove();
        }

      //  map.forEach(System.out::println);;

    //    for (Map.Entry<String, Date> entry : map.entrySet()){
     //       System.out.println(entry.getKey() + " - " + entry.getValue());
      //  }

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = createMap();
  //      HashMap<String, Date> map = Solution.createMap();
        removeAllSummerPeople(map);



    }
}
