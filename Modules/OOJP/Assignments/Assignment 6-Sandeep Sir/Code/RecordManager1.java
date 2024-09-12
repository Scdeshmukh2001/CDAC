package com.example.array;
import java.util.Scanner;

public class RecordManager1 {
	
	    private int[] records;

	    // Constructor to instantiate the array
	    public RecordManager1(int size) {
	        records = new int[size];
	    }

	    // Getter method to retrieve a record at a specific index
	    public int getRecord(int index) {
	        if (index >= 0 && index < records.length) {
	            return records[index];
	        } else {
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
	    }

	    // Setter method to set a record at a specific index
	    public void setRecord(int index, int value) {
	        if (index >= 0 && index < records.length) {
	            records[index] = value;
	        } else {
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        RecordManager1 manager = new RecordManager1(5); // Create an instance with an array of size 5
	        Scanner scanner = new Scanner(System.in);

	        // Accept records from the user using setter method
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter record " + (i + 1) + ": ");
	            int value = scanner.nextInt();
	            manager.setRecord(i, value);
	        }

	        // Print the records using getter method
	        System.out.println("Records:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(manager.getRecord(i));
	        }
	    }

}
