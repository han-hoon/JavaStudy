package implement.myInterface;

public class ChildInterfaceExample {

    public static void main(String[] args) {

        ParentInterface p1 = new ChildInterface1() {
            @Override
            public void method3() {

            }

            @Override
            public void method1() {

            }
        };

        ParentInterface p2 = new ChildInterface2() {
            @Override
            public void method3() {

            }

            @Override
            public void method1() {

            }
        };

        ParentInterface p3 = new ChildInterface3() {
            @Override
            public void method2() {

            }

            @Override
            public void method3() {

            }

            @Override
            public void method1() {

            }
        };

    }

}
