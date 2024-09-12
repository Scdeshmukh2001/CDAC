package com.example.array;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {3, 4, 5, 6, 7};

	        // Find intersection
	        Set<Integer> intersection = findIntersection(array1, array2);

	        // Print the intersection
	        System.out.println("Intersection of the two arrays: " + intersection);
	    }

	    public static Set<Integer> findIntersection(int[] array1, int[] array2) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> intersection = new HashSet<>();

	        // Add elements of the first array to the set
	        for (int num : array1) {
	            set1.add(num);
	        }

	        // Check elements of the second array against the set
	        for (int num : array2) {
	            if (set1.contains(num)) {
	                intersection.add(num);
	            }
	        }

	        return intersection;
	    }

}
