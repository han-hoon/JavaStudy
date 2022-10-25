package network;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        try(Socket socket = new Socket()) {
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost",5001));
            System.out.println("[연결 성공]");
        } catch (Exception e) { e.printStackTrace(); }
    }
}
