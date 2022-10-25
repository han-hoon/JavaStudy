package lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student {
    private String name;
    private String gender;
    private int score;
    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public int getScore() { return score; }
}

public class PredicateExample {
    private static List<Student> list = Arrays.asList(
        new Student("홍길동", "남자", 90),
        new Student("김순희", "여자", 80),
        new Student("감자바", "남자", 83),
        new Student("박한나", "여자", 95)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for(Student student : list)  {
            if(predicate.test(student)) {
                count++; sum+=student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg( t -> t.getGender().equals("남자"));
        System.out.println("남자 평균 점수 : " + maleAvg);
        
        double femaleAvg = avg(t -> t.getGender().equals("여자"));
        System.out.println("여자 평균 점수 : " + femaleAvg);
    }
}
