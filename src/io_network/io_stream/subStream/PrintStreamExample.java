package io_network.io_stream.subStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Test1/subStream/file.txt");
        PrintStream ps = new PrintStream(fos);
        ps.println("[프린터 보조 스트림]");
        ps.print("데이터를 ");
        ps.println("출력합니다.");

        ps.flush(); ps.close(); fos.close();
    }
}
