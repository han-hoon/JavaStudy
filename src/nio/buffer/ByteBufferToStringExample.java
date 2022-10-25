package nio.buffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");

        // 문자열 -> 인코딩 -> ByteBuffer
        String data = "안녕하세요";
        ByteBuffer buffer = charset.encode(data);

        // ByteBuffer -> 디코딩 -> 문자열
        data = charset.decode(buffer).toString();
        System.out.println("복원된 문자열 : " + data);
    }
}
