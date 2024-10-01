import java.util.Arrays;

public class ArrayManipulation {
    public static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n + 1];

        // Apply the range updates
        for (int[] query : queries) {
            int start = query[0] - 1;
            int end = query[1];
            int value = query[2];

            array[start] += value;
            if (end < n) {
                array[end] -= value;
            }
        }

        // Calculate the maximum value after all updates
        long max = 0;
        long current = 0;
        for (long num : array) {
            current += num;
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[][] queries1 = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println("Output: " + arrayManipulation(n1, queries1)); // Output: 200

        int n2 = 4;
        int[][] queries2 = {{1, 3, 50}, {2, 4, 70}};
        System.out.println("Output: " + arrayManipulation(n2, queries2)); // Output: 120
    }
}
