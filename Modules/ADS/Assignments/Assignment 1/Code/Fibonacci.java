import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
