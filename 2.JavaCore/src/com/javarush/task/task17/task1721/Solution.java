package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        allLines = Files.readAllLines(Paths.get(reader.readLine()));
        forRemoveLines = Files.readAllLines(Paths.get(reader.readLine()));
        //Solution.joinData();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
/*
        Iterator iterator1 = forRemoveLines.iterator();
        while (iterator1.hasNext()){
            String line1 = (String) iterator1.next();
            Iterator iterator2 = allLines.iterator();
            String line2 = null;
            while (iterator2.hasNext() && !line1.equals(line2)){
                line2 = (String) iterator2.next();
                if (line1.equals(line2)) iterator2.remove();
            }
            if (!line1.equals(line2)) {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }*/
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
