package network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerExample2 {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket()) {
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while(true) {
                System.out.println("[연결 대기]");
                Socket socket = serverSocket.accept();      // 클라이언트의 연결 요청 대기
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 수락] " + isa.getHostName());

                byte[] bytes = null;
                String message = null;

                InputStream is = socket.getInputStream();      // 연결된 Socket에서 입력 스트림을 얻음
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);
                System.out.println("[데이터 수신 성공] " +  message);

                OutputStream os = socket.getOutputStream();     // 연결된 Socket에서 출력 스트림을 얻음
                message = "Hello Client";
                bytes = message.getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 전송 성공]");

                is.close(); os.close();
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}
