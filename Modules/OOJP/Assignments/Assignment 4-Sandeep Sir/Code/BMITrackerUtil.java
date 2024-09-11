package com.example.bmicalculator;

import java.util.Scanner;

class BMITrackerUtil {
    public Scanner scanner = new Scanner(System.in);

    public void menuList() {
        System.out.println("1. Calculate BMI");
        System.out.println("2. Exit");
    }

    public BMITracker acceptRecord() {
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        return new BMITracker(height, weight);
    }

    public void printRecord(BMITracker bmiTracker) {
        System.out.println("Height: " + bmiTracker.getHeight() + " meters");
        System.out.println("Weight: " + bmiTracker.getWeight() + " kilograms");
        System.out.println("BMI: " + bmiTracker.getBMI());
    }
}
