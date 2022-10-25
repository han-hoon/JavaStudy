package io_network.io_stream.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExample {
    public static void main(String[] args) throws Exception {
        File readFile = new File("C:/Test1/FileIOStream/test.txt");
        File writerFile = new File("C:/Test1/FileIOStream/test2.txt");
        try(FileReader fr = new FileReader(readFile);
            FileWriter fw = new FileWriter(writerFile)) {
            int c;
            while((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("복사 되었습니다.");
    }
}
