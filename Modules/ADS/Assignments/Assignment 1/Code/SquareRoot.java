import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        System.out.println("The integer approximation of the square root of " + x + " is: " + integerSquareRoot(x));
    }

    public static int integerSquareRoot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1, end = x, result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}

