package com.example.array;
import java.util.Scanner;
public class ArrayMethodsExample {
	 public static void main(String[] args) {
	        // Declare a single-dimensional array of 5 integers
	        int[] numbers = new int[5];

	        // Call the method to accept records from the user
	        acceptRecord(numbers);

	        // Call the method to print the state of the array
	        printRecord(numbers);
	    }

	    // Method to accept records from the user
	    public static void acceptRecord(int[] array) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 5 integers to update the array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();
	    }

	    // Method to print the state of the array
	    public static void printRecord(int[] array) {
	        System.out.println("Current state of the array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Element at index " + i + ": " + array[i]);
	        }
	    }
}
