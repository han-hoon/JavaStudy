package io_network.io_stream.subStream.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Test1/subStream/serialize/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassA classA = (ClassA) ois.readObject();
        System.out.println("field1 : " + classA.field1);
        System.out.println("field2 : " + classA.field2.field1);
        System.out.println("field3 : " + classA.field3);
        System.out.println("field4 : " + classA.field4);

        ois.close(); fis.close();
    }

}
