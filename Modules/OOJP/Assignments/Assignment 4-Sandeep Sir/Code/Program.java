package com.example.toolboothcalculation;

public class Program {
    public static void main(String[] args) {
        TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil();
        TollBoothRevenueManager manager = new TollBoothRevenueManager(50.0, 100.0, 30.0);
        while (true) {
            util.menuList();
            System.out.print("Choose an option: ");
            int choice = util.scanner.nextInt();
            util.scanner.nextLine(); // Consume the newline character
            if (choice == 1) {
                util.acceptTollRates(manager);
            } else if (choice == 2) {
                util.acceptVehicleCounts(manager);
            } else if (choice == 3) {
                util.printRecord(manager);
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
