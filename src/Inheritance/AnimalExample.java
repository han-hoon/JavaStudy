package Inheritance;

public class AnimalExample {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
    public static void printSound(Animal animal) {
        System.out.println(animal.getSound());
    }
}
class Cat extends Animal {
    public String getSound() { return "야옹"; }
}

class Dog extends Animal {
    public String getSound() { return "멍멍"; }
}

class Animal {
    public String getSound() { return ""; }
}

