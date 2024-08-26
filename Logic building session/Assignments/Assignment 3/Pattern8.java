public class Pattern8 {
    public static void main(String[] args) {
        // Loop to handle the number of rows
        for (int i = 5; i >= 1; i--) {
            // Loop to handle the columns
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) {
                    System.out.print("*");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
