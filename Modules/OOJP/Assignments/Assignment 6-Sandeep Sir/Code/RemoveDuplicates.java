package com.example.array;
import java.util.Arrays;

public class RemoveDuplicates {
	 public static int removeDuplicates(int[] array) {
	        if (array.length == 0) {
	            return 0;
	        }

	        // Sort the array to bring duplicates together
	        Arrays.sort(array);

	        // Index of the last unique element
	        int j = 0;

	        // Traverse the array
	        for (int i = 1; i < array.length; i++) {
	            // If current element is different from the last unique element
	            if (array[i] != array[j]) {
	                j++;
	                array[j] = array[i];
	            }
	        }

	        // Return the count of unique elements
	        return j + 1;
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 2, 3, 4, 4, 5};
	        int n = removeDuplicates(array);

	        // Print the unique elements
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }

}
