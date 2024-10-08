public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "madam";
        String input2 = "hello";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + isPalindrome(input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + isPalindrome(input2));
    }
}

