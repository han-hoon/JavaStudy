package nestedClass;

public class NestedClassExample {

    public static void main(String[] args) {
        NestedClass.C c = new NestedClass.C();

        c.field1 = 1;
        c.method1();
        NestedClass.C.field2 = 3;
        NestedClass.C.method2();
    }

}
