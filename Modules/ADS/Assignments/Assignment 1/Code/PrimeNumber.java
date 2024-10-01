public class PrimeNumber {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Corner case
        if (number <= 1) {
            return false;
        }
        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number1 = 29;
        int number2 = 15;

        System.out.println(number1 + " is a prime number: " + isPrime(number1));
        System.out.println(number2 + " is a prime number: " + isPrime(number2));
    }
}
