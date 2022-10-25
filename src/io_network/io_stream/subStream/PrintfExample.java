package io_network.io_stream.subStream;

public class PrintfExample {

    public static void main(String[] args) {
        System.out.printf("상품의 가격:%d원\n" , 123);
        System.out.printf("상품의 가격:%6d원\n" , 123);
        System.out.printf("상품의 가격:%-6d원\n" , 123);
        System.out.printf("상품의 가격:%06d원\n" , 123);
    }
}
