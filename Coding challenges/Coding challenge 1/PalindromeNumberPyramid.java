public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num--);
            }
            num = 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}

