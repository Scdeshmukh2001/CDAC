import java.util.Scanner;

public class Qs4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Rearrange the array
        rearrangeArray(arr);

        // Print the rearranged array
        System.out.println("Array after moving negatives to the left and positives to the right:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to rearrange the array
    public static void rearrangeArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // If the left element is negative, move the left pointer to the right
            if (arr[left] < 0) {
                left++;
            }
            // If the right element is positive, move the right pointer to the left
            else if (arr[right] >= 0) {
                right--;
            }
            // If left is positive and right is negative, swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

