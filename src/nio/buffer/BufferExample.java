package nio.buffer;

import java.nio.ByteBuffer;

public class BufferExample {
    public static void main(String[] args) {
        System.out.println("[7바이트 크기로 버퍼생성]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        printState(buffer);

        buffer.put((byte)10);
        buffer.put((byte)11);

        System.out.println("[2바이트 저장 후]");
        printState(buffer);

        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);

        System.out.println("[3바이트 저장 후]");
        printState(buffer);

        buffer.flip();
        System.out.println("[flip() 실행후]");
        printState(buffer);

        buffer.get(new byte[3]);    // 상대적 읽기()
        System.out.println("[3바이트 읽은 후]");
        printState(buffer);

        buffer.mark();
        System.out.println("------[현재 위치 마크]");

        buffer.get(new byte[2]);    // 상대적 읽기
        System.out.println("[2바이트 읽은 후]");
        printState(buffer);

        buffer.reset();     // 마크 position으로 이동
        System.out.println("------[마크 위치로 옮김]");
        printState(buffer);
        
        buffer.rewind();        // position을 0으로 이동
        System.out.println("[rewind()] 실행 후");
        printState(buffer);

        buffer.clear();
        System.out.println("[clear()] 실행 후");
        printState(buffer);
    }

    private static void printState(ByteBuffer buffer) {
        System.out.print("\tposition: " + buffer.position() + ", ");
        System.out.print("\tlimit: " + buffer.limit() + ", ");
        System.out.println("\tcapacity: " + buffer.capacity());
    }
}
