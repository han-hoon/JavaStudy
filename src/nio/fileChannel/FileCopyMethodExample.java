package nio.fileChannel;

import java.nio.file.*;

public class FileCopyMethodExample {
    public static void main(String[] args) throws Exception{
        Path from = Paths.get("C:/Temp/bufferTest/test.png");
        Path to = Paths.get("C:/Temp/bufferTest/test3.png");

        Files.copy(from, to , StandardCopyOption.REPLACE_EXISTING);
        System.out.println("파일 복사 성공");
    }
}
