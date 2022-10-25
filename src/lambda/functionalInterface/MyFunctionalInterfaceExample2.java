package lambda.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MyFunctionalInterface2 {
    public int method(int x, int y);
}

public class MyFunctionalInterfaceExample2 {

    static int[] intArr = new int[1];

    public static void main(String[] args) {

        MyFunctionalInterface2 fi;
        fi = (x, y) -> {
            int result = x + y;
            int a = sum(1,2);
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> {
            return intArr[2];
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x,y);
        System.out.println(fi.method(2, 5));
    }
    public static int sum(int x, int y) {
        int i = intArr[2];

        List<String> list = Arrays.asList("","","");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        return x + y;
    }
}
