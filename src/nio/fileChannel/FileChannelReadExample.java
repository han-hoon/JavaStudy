package nio.fileChannel;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReadExample {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:/Temp/file.txt");
        Files.createDirectories(path.getParent());

        FileChannel fileChannel = FileChannel.open(
                path, StandardOpenOption.READ);

        ByteBuffer buffer = ByteBuffer.allocateDirect(100);
        Charset charset = Charset.defaultCharset();
        String data = "";

        int byteCount = 0;

        while(true) {
            byteCount = fileChannel.read(buffer);
            if(byteCount == -1) break;
            buffer.flip();
            data += charset.decode(buffer).toString();
            buffer.clear();
        }
        fileChannel.close();

        System.out.println("file.txt : " + data);
    }
}
