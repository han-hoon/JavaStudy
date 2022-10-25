package io_network.io_stream;

import java.io.InputStream;

public class SystemInExample {

    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        byte[] dates = new byte[100];

        System.out.println("이름 : ");
        int nameBytes = is.read(dates);
        String name = new String(dates, 0, nameBytes-1);    // nameBytes-1 -> Enter 키에 해당하는 마지막 바이트 제거
        System.out.println("입력한 이름 : " + name);
    }
}
