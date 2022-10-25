package implement.myInterface;

public interface ChildInterface2 extends  ParentInterface {

    @Override
    default void method2() {
        ParentInterface.super.method2();
    }

    void method3();
}
