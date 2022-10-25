package io_network.io_stream;

import java.io.Console;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ConsoleExample {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("아이디 : ");
        String id = console.readLine();

        System.out.println("패스워드 : ");
        char[] chrPassword = console.readPassword();    // 입력 중인 문자가 출력되지 않음
        String password = new String(chrPassword);

        System.out.println("----------------");
        System.out.println(id);
        System.out.println(password.toString());
    }
}
