package collections.setExample;

import java.util.Objects;

public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Member) {
            Member member = (Member)o;
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;       // name과 age가 같으면 동일안 hashCode 리턴
    }
}
