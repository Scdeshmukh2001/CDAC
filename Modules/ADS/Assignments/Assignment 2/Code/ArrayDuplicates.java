public class ArrayDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        
        System.out.println("New length for arr1: " + removeDuplicates(arr1)); // Output: 2
        System.out.println("New length for arr2: " + removeDuplicates(arr2)); // Output: 4
    }
}
