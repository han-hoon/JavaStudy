package lambda.referenceMethod;

import java.util.function.BiFunction;
import java.util.function.Function;

class Student {
    private String name;
    private String country;
    public Student(String name) { this.name = name; }
    public Student(String name, String country) { this.name = name; this.country = country; }
}

public class Main {
    public static void main(String[] args) {
        Function<String, Student> function = Student::new;
        Student student = function.apply("YeeSan");

        BiFunction<String, String, Student> function2 = Student::new;
        Student student2 = function2.apply("YeeSan", "Korea");
    }
}