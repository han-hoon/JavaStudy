package exception;


public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Dog dog = new Dog();

        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    private static void changeDog(Animal animal) {
        //if(animal instanceof  Dog) {
            Dog dog = (Dog) animal;
        //}
    }

    static class Animal {}
    static class Dog extends Animal {}
    static class Cat extends Animal {}
}
