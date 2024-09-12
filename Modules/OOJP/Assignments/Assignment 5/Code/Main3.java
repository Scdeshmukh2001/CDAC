// Base class
class Vehicle {
    // Method to start the engine
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }

    // Method to stop the engine
    public void stopEngine() {
        System.out.println("Vehicle engine stopped.");
    }
}

// Subclass Car
class Car extends Vehicle {
    // Override the startEngine method
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    // Override the stopEngine method
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped when the key was turned off.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    // Override the startEngine method
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick-start.");
    }

    // Override the stopEngine method
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped when the ignition was turned off.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Create a Vehicle reference to a Car object
        Vehicle car = new Car();
        // Create a Vehicle reference to a Motorcycle object
        Vehicle motorcycle = new Motorcycle();

        // Start and stop the engine for the car
        car.startEngine();
        car.stopEngine();

        // Start and stop the engine for the motorcycle
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

