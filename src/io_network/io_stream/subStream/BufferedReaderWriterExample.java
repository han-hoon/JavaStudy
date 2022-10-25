package io_network.io_stream.subStream;

import java.io.*;

public class BufferedReaderWriterExample {

    public static void main(String[] args) throws Exception {

        Reader reader = new InputStreamReader(new FileInputStream("C:/Test1/subStream/in.txt"));
        Writer writer = new OutputStreamWriter(new FileOutputStream("C:/Test1/subStream/out.txt"));

        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(writer);

        String data;
        while((data = br.readLine()) != null) {
            bw.write(data);
        }
        System.out.println("복사 되었습니다.");
        bw.flush();
        bw.close();
        br.close();
    }
}
