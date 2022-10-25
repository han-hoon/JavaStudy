package Inheritance.abstracClass;

public class AnimalExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("----------");

        Animal animal = null;

        animal = dog;
        animal.sound();

        animal = cat;
        animal.sound();

        System.out.println("-----------");

        animalSound(new Dog());
        animalSound(new Cat());
    }

    private static void animalSound(Animal animal) {
        animal.sound();
    }

}
