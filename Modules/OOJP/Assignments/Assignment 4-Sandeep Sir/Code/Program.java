package com.example.compoundinterest;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
        CompoundInterestCalculator calculator = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            util.menuList();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculator = util.acceptRecord();
                    break;
                case 2:
                    if (calculator != null) {
                        util.printRecord(calculator);
                    } else {
                        System.out.println("No record found. Please accept a record first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


