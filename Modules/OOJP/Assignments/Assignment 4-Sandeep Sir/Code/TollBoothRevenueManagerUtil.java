package com.example.toolboothcalculation;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
    public Scanner scanner = new Scanner(System.in);

    public void menuList() {
        System.out.println("1. Set Toll Rates");
        System.out.println("2. Enter Vehicle Counts");
        System.out.println("3. Calculate and Display Revenue");
        System.out.println("4. Exit");
    }

    public void acceptTollRates(TollBoothRevenueManager manager) {
        System.out.print("Enter toll rate for Car: ₹");
        manager.setCarRate(scanner.nextDouble());
        System.out.print("Enter toll rate for Truck: ₹");
        manager.setTruckRate(scanner.nextDouble());
        System.out.print("Enter toll rate for Motorcycle: ₹");
        manager.setMotorcycleRate(scanner.nextDouble());
    }

    public void acceptVehicleCounts(TollBoothRevenueManager manager) {
        System.out.print("Enter number of Cars: ");
        manager.setCarCount(scanner.nextInt());
        System.out.print("Enter number of Trucks: ");
        manager.setTruckCount(scanner.nextInt());
        System.out.print("Enter number of Motorcycles: ");
        manager.setMotorcycleCount(scanner.nextInt());
    }

    public void printRecord(TollBoothRevenueManager manager) {
        manager.calculateTotalRevenue();
        System.out.println(manager);
    }
}
