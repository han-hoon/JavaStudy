package nestedClass.ex3;

public class Outter {

    String field = "Outter-field";

    // 자바 7 이전
    public void method1(final int arg) {
        final int localVariable = 1;
        //arg = 100;
        //localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    // 자바 8 이후
    public static void method2(int arg) {
        int localVariable = 1;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}
