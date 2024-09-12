// Base class
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create an object of Animal
        Animal animal = new Animal();
        animal.name = "Generic Animal";
        animal.eat();
        animal.sleep();

        // Create an object of Dog
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
