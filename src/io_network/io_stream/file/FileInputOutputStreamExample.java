package io_network.io_stream.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:/Test1/FileIOStream/test.png" );
            FileOutputStream fos = new FileOutputStream("C:/Test1/FileIOStream/test2.png"))
        {
            int readByteNo = 0;
            byte[] readBytes = new byte[100];

            while((readByteNo = fis.read(readBytes)) != -1 ) {
                fos.write(readBytes, 0, readByteNo);
            }
            fos.flush();
        } catch (Exception e) {
            System.out.println("복사 중 예외 발생");
        }
        System.out.println("복사 되었습니다.");
    }
}
