package collections.lifoAndFifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

class Message {
    public String command;
    public String to;
    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        // 메세지 저장
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendMs", "신용권"));
        messageQueue.offer(new Message("sendKaKaoTalk", "홍두께"));
        
        while(!messageQueue.isEmpty()) { // 메세지 큐가 비워질 때까지 반복
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break; 
                case "sendMs" :
                    System.out.println(message.to + "님에게 MS를 보냅니다");
                    break;
                case "sendKaKaoTalk" :
                    System.out.println(message.to + "님에게 카톡을 보냅니다");
                    break;
            }
        }
    }
}
