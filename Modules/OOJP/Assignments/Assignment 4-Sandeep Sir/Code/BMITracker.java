package com.example.bmicalculator;

public class BMITracker {
    private double weight;
    private double height;
    private double bmi;
    private String classification;

    // Constructor
    public BMITracker(double weight, double height) {
        this.weight = weight;
        this.height = height;
        calculateBMI();
        classifyBMI();
    }

    // Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        calculateBMI();
        classifyBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateBMI();
        classifyBMI();
    }

    public double getBMI() {
        return bmi;
    }

    public String getClassification() {
        return classification;
    }

    // Business Logic Methods
    private void calculateBMI() {
        this.bmi = weight / (height * height);
    }

    private void classifyBMI() {
        if (bmi < 18.5) {
            classification = "Underweight";
        } else if (bmi < 24.9) {
            classification = "Normal weight";
        } else if (bmi < 29.9) {
            classification = "Overweight";
        } else {
            classification = "Obese";
        }
    }

    @Override
    public String toString() {
        return "BMI: " + bmi + ", Classification: " + classification;
    }
}
