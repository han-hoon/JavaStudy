package io_network.io_stream.subStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Test1/subStream/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Integer(10));
        oos.writeObject(new Double(3.14));
        oos.writeObject(new int[] {1,2,3});
        oos.writeObject(new String("홍길동"));

        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("C:/Test1/subStream/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer obj1 = (Integer)ois.readObject();
        Double obj2 = (Double) ois.readObject();
        int[] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close(); fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        for(int i : obj3) System.out.print(i + ", ");
        System.out.println();
        System.out.println(obj4);
    }
}
