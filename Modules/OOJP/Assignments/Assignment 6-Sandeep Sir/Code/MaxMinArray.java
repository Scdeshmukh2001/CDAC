package com.example.array;

import java.util.Scanner;

public class MaxMinArray {
	 
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input the size of the array
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();
		        
		        // Initialize the array
		        int[] array = new int[n];
		        
		        // Input the elements of the array
		        System.out.print("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }
		        
		        // Initialize max and min with the first element of the array
		        int max = array[0];
		        int min = array[0];
		        
		        // Traverse the array to find the max and min values
		        for (int i = 1; i < n; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            }
		            if (array[i] < min) {
		                min = array[i];
		            }
		        }
		        
		        // Output the results
		        System.out.println("Maximum value in the array: " + max);
		        System.out.println("Minimum value in the array: " + min);
		        
		        scanner.close();
		    
		}

}
