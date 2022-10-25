package io_network.io_stream.subStream.serialize;

import java.io.Serializable;

public class ClassA implements Serializable {
    int field1;                     // 직렬화에 포함
    ClassB field2 = new ClassB();   // 직렬화에 포함
    static int field3;              // 직렬화 제외
    transient int field4;           // 직렬화 제외
}

class ClassB implements Serializable {
    static final long serialVersionUID = -1268650229006463571L;
    int field1;     // 직렬화에 포함
}