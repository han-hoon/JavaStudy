package lambda.defaultMethod;

import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

    public static void main(String[] args) {

        // 2의 배수 검사
        IntPredicate predicateA = a-> a%2 == 0;

        // 3의 배수 검사
        IntPredicate predicateB = a-> a%3 == 0;

        IntPredicate predicateAB ;
        boolean result;

        // and()
        predicateAB = predicateA.and(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수 입니까? " + result);

        Consumer<String> consumer1 = s -> System.out.println(s);
        Consumer<String> consumer2 = System.out::println;
        consumer1.accept("consumer1");
        consumer2.accept("consumer2");
        // or()
        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2또는 3의 배수 입니까? " + result);

        // negate()
        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수 입니까? " + result);

    }

}
