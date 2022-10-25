package testPackage;

public class Test {

    public static void main(String[] args) {
        Test2 test = new Test2();
        test.printResult();
    }

}


abstract class TestAbstractClass {

    String name = "name1";
    String id = "id1";
    String password = "password1";

    public TestAbstractClass() {}

    public TestAbstractClass(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void printResult() {
        System.out.println("name : " + name + " , id : " + id + " , password : " + password);
    }

}

class Test2 extends TestAbstractClass {

    String name = "name2";
    String id = "id2";
    String password = "password2";
    
}

class Test3 extends RuntimeException {

}

