package nestedClass;

public class NestedClass {

    interface NestedInterface {

    }

    class A {
        class B {
            B() {}
            int field1;
            void method1() {}
        }

    }

    static class C {
        C(){}
        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }
}
