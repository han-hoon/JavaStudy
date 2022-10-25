package io_network.io_stream.subStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Test1/subStream/test.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(10);

        dos.flush(); dos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Test1/subStream/test.dat");
        DataInputStream dis = new DataInputStream(fis);

        String name = dis.readUTF();
        double score = dis.readDouble();
        int order = dis.readInt();
        System.out.println("name : " + name + ", score : " + score + ", order : " + order);
        dis.close(); dis.close(); fis.close();
    }
}
