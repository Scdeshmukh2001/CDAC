public class Palindrome {
    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int input1 = 121;
        int input2 = -121;

        System.out.println("Input: " + input1 + " Output: " + isPalindrome(input1));
        System.out.println("Input: " + input2 + " Output: " + isPalindrome(input2));
    }
}

