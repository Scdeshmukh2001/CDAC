package com.example.compoundinterest;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
    private Scanner scanner;

    public CompoundInterestCalculatorUtil() {
        scanner = new Scanner(System.in);
    }

    public CompoundInterestCalculator acceptRecord() {
        System.out.print("Enter the initial investment amount (₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter the investment duration (in years): ");
        int years = scanner.nextInt();

        return new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    public void printRecord(CompoundInterestCalculator calculator) {
        double futureValue = calculator.calculateFutureValue();
        double totalInterest = calculator.calculateTotalInterest();
        System.out.printf("Future Value: ₹%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
    }

    public void menuList() {
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println("3. Exit");
    }
}
