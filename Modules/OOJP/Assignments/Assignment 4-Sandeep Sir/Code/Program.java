package com.example.discountcalculation;

public class Program {
    public static void main(String[] args) {
        DiscountCalculatorUtil util = new DiscountCalculatorUtil();
        while (true) {
            util.menuList();
            System.out.print("Choose an option: ");
            int choice = util.scanner.nextInt();
            util.scanner.nextLine(); // Consume the newline character
            if (choice == 1) {
                DiscountCalculator discountCalculator = util.acceptRecord();
                util.printRecord(discountCalculator);
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
