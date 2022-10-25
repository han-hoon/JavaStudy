package io_network.io_stream.subStream.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Test1/subStream/serialize/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.field1 = 2;
        classA.field3 = 3;
        classA.field4 = 4;

        oos.writeObject(classA);
        oos.flush(); oos.close(); fos.close();
    }
}
