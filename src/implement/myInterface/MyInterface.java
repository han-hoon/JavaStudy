package implement.myInterface;

public interface MyInterface {

    void method1();
    default void method2() {
        System.out.println("MyInterface method2() 실행");
    }
}
