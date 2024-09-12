package com.example.array;
import java.util.Scanner;

public class RecordManager {
	 
		    private int[] records;

		    // Constructor to instantiate the array
		    public RecordManager(int size) {
		        records = new int[size];
		    }

		    // Method to accept records from the user
		    public void acceptRecord() {
		        Scanner scanner = new Scanner(System.in);
		        for (int i = 0; i < records.length; i++) {
		            System.out.print("Enter record " + (i + 1) + ": ");
		            records[i] = scanner.nextInt();
		        }
		    }

		    // Method to print the records
		    public void printRecord() {
		        System.out.println("Records:");
		        for (int record : records) {
		            System.out.println(record);
		        }
		    }

		    // Main method to test the functionality
		    public static void main(String[] args) {
		        RecordManager manager = new RecordManager(5); // Create an instance with an array of size 5
		        manager.acceptRecord(); // Accept records from the user
		        manager.printRecord(); // Print the records
		    }
}
