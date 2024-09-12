package com.example.array;
import java.util.Scanner;

public class ArrayExample {
	 public static void main(String[] args) {
	        // Declare a single-dimensional array of 5 integers
	        int[] numbers = new int[5];

	        // Print the default values of the array
	        System.out.println("Default values of the array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }

	        // Create a Scanner object to accept user input
	        Scanner scanner = new Scanner(System.in);

	        // Accept records from the user
	        System.out.println("Enter 5 integers to update the array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Print the updated values of the array
	        System.out.println("Updated values of the array:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("Element at index " + i + ": " + numbers[i]);
	        }

	        // Close the scanner
	        scanner.close();
	    }
}
