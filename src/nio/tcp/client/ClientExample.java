package nio.tcp.client;

import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ClientExample {
    public static void main(String[] args) {
        SocketChannel socketChannel = null;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(true);
            System.out.println("[연결 요청]");
            socketChannel.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socketChannel.isOpen()) { try { socketChannel.close(); } catch(Exception e) {e.printStackTrace();}
            }
        }
    }

}
