package exception;

public class TEst {

    public void method1() throws NumberFormatException, ClassNotFoundException {}

    public static void main(String[] args) {
        int[] a = {1,2,3};

        for(int i = 0; i <= 5; i++) {
            System.out.println(a[i]);
        }
    }

    void method2() throws Exception { method1(); }

}
