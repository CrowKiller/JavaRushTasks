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

    @Override
    public void flush() throws IOException {
        source.flush();
    }

    @Override
    public void write(int b) throws IOException {
        source.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        source.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        source.write(b);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        source.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
