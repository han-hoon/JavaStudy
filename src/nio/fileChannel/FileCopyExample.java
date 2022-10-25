package nio.fileChannel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class FileCopyExample {
    public static void main(String[] args) throws Exception{
        Path from = Paths.get("C:/Temp/bufferTest/test.png");
        Path to = Paths.get("C:/Temp/bufferTest/test2.png");

        FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);
        FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
        int byteCount = 0;
        while(true) {
            buffer.clear();
            byteCount = fileChannel_from.read(buffer);
            if(byteCount == -1) break;
            buffer.flip();
            fileChannel_to.write(buffer);
        }
        fileChannel_from.close();
        fileChannel_to.close();
        System.out.println("파일 복사 성공");
    }
}
