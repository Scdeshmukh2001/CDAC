package com.example.array;

public class MissingNumber {
	  public static void main(String[] args) {
	        int[] array = {1, 2, 4, 5, 6}; // Example array
	        int n = array.length + 1; // Since one number is missing

	        int missingNumber = findMissingNumber(array, n);
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    public static int findMissingNumber(int[] array, int n) {
	        // Calculate the expected sum of numbers from 1 to N
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the actual sum of the array elements
	        int actualSum = 0;
	        for (int num : array) {
	            actualSum += num;
	        }

	        // The missing number is the difference between the expected sum and the actual sum
	        return expectedSum - actualSum;
	    }

}
