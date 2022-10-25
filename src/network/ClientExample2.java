package network;

import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientExample2 {
    public static void main(String[] args) {
        try(Socket socket = new Socket()) {
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost",5001));    // 서버에 연결 요청
            System.out.println("[연결 성공]");

            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();     // 연결된 Socket에서 출력 스트림을 얻음
            message = "Hello Server";
            bytes = message.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 전송 성공]");

            InputStream is = socket.getInputStream();       // 연결된 Socket에서 입력 스트림을 얻음
            bytes = new byte[100];
            int readByteCount = is.read(bytes);
            message = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);
            System.out.println("[데이터 수신 성공] " + message);

            os.close(); is.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
