package nestedClass.ex3;

public class OutterExmaple {

    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested();
        nested.print();
    }

}
