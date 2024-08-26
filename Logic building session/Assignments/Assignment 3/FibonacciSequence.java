public class FibonacciSequence {
    public static void main(String[] args) {
        int target = 21; // The number up to which we want to print the Fibonacci sequence
        int a = 0; // First number in the Fibonacci sequence
        int b = 1; // Second number in the Fibonacci sequence

        // Print Fibonacci sequence up to target
        System.out.println("Fibonacci sequence up to " + target + ":");

        // Print the first two numbers if they are within the target
        if (a <= target) {
            System.out.print(a + " ");
        }
        if (b <= target) {
            System.out.print(b + " ");
        }

        // Compute the rest of the Fibonacci sequence
        while (true) {
            int next = a + b; // Compute the next Fibonacci number
            if (next > target) { // Stop if the next number exceeds the target
                break;
            }
            System.out.print(next + " "); // Print the next number
            a = b; // Update a to the previous number
            b = next; // Update b to the new number
        }
    }
}
