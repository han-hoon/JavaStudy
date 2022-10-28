package nio.tcp.server;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocketChannel serverSocketChannel = null;
        try {
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(true);
            serverSocketChannel.bind(new InetSocketAddress(5001));
            while(true) {
                System.out.println("[연결 대기중]");
                SocketChannel socketChannel = serverSocketChannel.accept();
                InetSocketAddress isa = (InetSocketAddress) socketChannel.getRemoteAddress();
                System.out.println("[연결 수락] " + isa.getHostName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(serverSocketChannel.isOpen()) {  // ServerSocketChannel이 열려있을 경우
                try { serverSocketChannel.close();  } catch (Exception e) {e.printStackTrace();}
            }
        }
    }
}
