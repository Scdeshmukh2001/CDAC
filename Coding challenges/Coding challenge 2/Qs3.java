import java.util.Scanner;
import java.util.ArrayList;

public class Qs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the average
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / n;

        // Find and print numbers greater than the average
        System.out.println("The numbers greater than the average (" + average + ") are:");
        for (int num : array) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
    }
}

