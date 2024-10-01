public class Armstrong {
    // Method to calculate the power of a number
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        // Calculate the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = number;

        // Calculate the sum of the digits raised to the power of the number of digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += power(remainder, digits);
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == number;
    }

    public static void main(String[] args) {
        int number1 = 153;
        int number2 = 123;

        System.out.println(number1 + " is an Armstrong number: " + isArmstrong(number1));
        System.out.println(number2 + " is an Armstrong number: " + isArmstrong(number2));
    }
}
