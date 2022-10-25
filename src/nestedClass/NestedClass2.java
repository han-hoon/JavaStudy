package nestedClass;

public class NestedClass2 {

    void method() {
        class D {
          D(){}
          int field1;
          void method1() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
    }

    void method2() {
        class DowonloadThread extends Thread {

        }
        DowonloadThread thread = new DowonloadThread();
        thread.run();
    }
}
