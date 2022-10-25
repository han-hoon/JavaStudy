package io_network.io_stream.subStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {

    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            isr = new InputStreamReader(new FileInputStream("C:/Test1/subStream/in.txt"));
            osw = new OutputStreamWriter(new FileOutputStream("C:/Test1/subStream/out.txt"));
            int readByteNo;
            char[] readByte = new char[100];
            while((readByteNo = isr.read(readByte)) != -1) {
                osw.write(readByte, 0 , readByteNo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{ osw.flush(); osw.close(); isr.close(); } catch (Exception e){e.printStackTrace();};
        }
        System.out.println("복사 되었습니다.");
    }

}
