public class ArrayLeftRotation {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d is greater than n
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int d1 = 2;
        rotateLeft(arr1, d1);
        System.out.println("Output: " + java.util.Arrays.toString(arr1)); // Output: [3, 4, 5, 1, 2]

        int[] arr2 = {10, 20, 30, 40};
        int d2 = 1;
        rotateLeft(arr2, d2);
        System.out.println("Output: " + java.util.Arrays.toString(arr2)); // Output: [20, 30, 40, 10]
    }
}
