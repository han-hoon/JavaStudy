package nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferExample {
    public static void main(String[] args) {
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(100);     // 다이렉트 버퍼 생성
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(100);             // 넌다이렉트 버퍼 생성

        System.out.println("[Direct Buffer]저장용량 : " + byteBuffer1.capacity() + " 바이트");
        System.out.println("[non-Direct Buffer]저장용량 : " + byteBuffer2.capacity() + " 바이트");

        CharBuffer charBuffer1 = ByteBuffer.allocateDirect(100).asCharBuffer();
        CharBuffer charBuffer2 = ByteBuffer.allocate(100).asCharBuffer();
        System.out.println("[Direct Buffer]저장용량 : " + charBuffer1.capacity() + " 문자");
        System.out.println("[non-Direct Buffer]저장용량 : " + charBuffer2.capacity() + " 문자");

        IntBuffer intBuffer1 = ByteBuffer.allocateDirect(100).asIntBuffer();
        IntBuffer intBuffer2 = ByteBuffer.allocate(100).asIntBuffer();
        System.out.println("[Direct Buffer]저장용량 : " + intBuffer1.capacity() + " 정수");
        System.out.println("[non-Direct Buffer]저장용량 : " + intBuffer2.capacity() + " 정수");


    }
}
