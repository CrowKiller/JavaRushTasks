package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, Exception {
        while (true) {
            FileInputStream fs1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (fs1.available() < 1000) {
                fs1.close();
                throw new DownloadException();
            }
            fs1.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
