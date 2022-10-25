package io_network.io_stream.subStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = 0;
        long start = 0, end = 0;

        fis = new FileInputStream("C:/Test1/subStream/in.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Test1/subStream/out.jpg");
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            fos.write(data);                // 직접사용
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close(); bis.close(); fis.close();
        System.out.println("사용하지 않았을 때 : " + (end-start) + "ms");

        fis = new FileInputStream("C:/Test1/subStream/in.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/Test1/subStream/out2.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close(); fos.close(); fis.close();
        System.out.println("사용하지 했을 때 : " + (end-start) + "ms");
    }
}
