public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 8, 9};

        reverseArray(arr1);
        reverseArray(arr2);

        System.out.println("Reversed arr1: " + java.util.Arrays.toString(arr1));
        System.out.println("Reversed arr2: " + java.util.Arrays.toString(arr2));
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
