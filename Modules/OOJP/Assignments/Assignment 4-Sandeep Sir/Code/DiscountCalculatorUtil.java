package com.example.discountcalculation;

import java.util.Scanner;

public class DiscountCalculatorUtil {
    public Scanner scanner = new Scanner(System.in);

    public void menuList() {
        System.out.println("1. Calculate Discount");
        System.out.println("2. Exit");
    }

    public DiscountCalculator acceptRecord() {
        System.out.print("Enter original price: ₹");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter discount rate (%): ");
        double discountRate = scanner.nextDouble();
        return new DiscountCalculator(originalPrice, discountRate);
    }

    public void printRecord(DiscountCalculator discountCalculator) {
        System.out.println(discountCalculator);
    }
}
