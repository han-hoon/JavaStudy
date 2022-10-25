package lambda.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> { return (int) (Math.random() * 6) + 1; };
        System.out.println("눈의 수 : " + intSupplier.getAsInt());
    }
}
