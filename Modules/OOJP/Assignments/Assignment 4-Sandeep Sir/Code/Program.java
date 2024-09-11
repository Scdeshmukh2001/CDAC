package com.example.bmicalculator;
public class Program {
    public static void main(String[] args) {
        BMITrackerUtil util = new BMITrackerUtil();
        while (true) {
            util.menuList();
            System.out.print("Choose an option: ");
            int choice = util.scanner.nextInt();
            util.scanner.nextLine(); // Consume the newline character
            if (choice == 1) {
                BMITracker bmiTracker = util.acceptRecord();
                util.printRecord(bmiTracker);
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
