package com.example.assignment5;

public class InstanceCounter {
    // Static variable to keep track of the number of instances
    private static int instanceCount = 0;

    // Constructor
    public InstanceCounter() {
        // Increment the instance count each time a new object is created
        instanceCount++;
    }

    // Static method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        // Creating instances of InstanceCounter
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        // Displaying the number of instances created
        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}
