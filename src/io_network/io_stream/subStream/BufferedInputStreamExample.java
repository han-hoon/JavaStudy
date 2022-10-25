package io_network.io_stream.subStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws Exception {
        long start = 0, end = 0;

        FileInputStream fis1 = new FileInputStream("C:/Test1/subStream/in.txt");
        start = System.currentTimeMillis();

        while(fis1.read() != -1) {}
        end = System.currentTimeMillis();
        System.out.println("BufferedInputStream 사용 안함 : " + (end - start) + "ms");
        fis1.close();

        FileInputStream fis2 = new FileInputStream("C:/Test1/subStream/in.txt");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while(bis.read() != -1);
        end = System.currentTimeMillis();
        System.out.println("BufferedInputStream 사용 : " + (end - start) + "ms");

        bis.close();
        fis2.close();
    }

}
