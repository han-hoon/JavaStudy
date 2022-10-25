package nio.buffer;

import java.io.DataInputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.StandardOpenOption;

public class ByteBufferToIntBufferExample {
    public static void main(String[] args) {
        // int[] -> IntBuffer -> ByteBuffer
        int[] writeData = {10, 20};
        IntBuffer writerIntBuffer = IntBuffer.wrap(writeData);
        ByteBuffer writeByteBuffer = ByteBuffer.allocateDirect(writerIntBuffer.capacity() * 4);
        for(int i = 0; i < writerIntBuffer.capacity(); i++) {
            writeByteBuffer.putInt(writeByteBuffer.get(i));
        }
        writeByteBuffer.flip();

        // ByteBuffer -> IntBuffer -> int[]
        ByteBuffer readByteBuffer = writeByteBuffer;
        IntBuffer readIntBuffer = readByteBuffer.asIntBuffer();
        int[] readData = new int[readIntBuffer.capacity()];
        readIntBuffer.get(readData);
        System.out.println("[복원된 데이터] : " + readData.toString());
    }
}
