package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream source = null;

    public AmigoOutputStream(FileOutputStream stream) throws FileNotFoundException {
        super("");
        this.source = stream;
    }

    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
        source = this;
    }



    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
