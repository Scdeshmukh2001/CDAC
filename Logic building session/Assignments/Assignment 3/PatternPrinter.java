public class PatternPrinter {
public static void main(String[] args) {
int n = 5; // Number of rows for the hourglass and diamond parts
// Hourglass Shape
for (int i = n; i >= 1; i--) {
// Print leading spaces
for (int j = 0; j < n - i; j++) {
System.out.print(" ");
}
// Print stars
for (int j = 0; j < (2 * i - 1); j++) {
System.out.print("*");
}
// Move to the next line
System.out.println();
}
// Diamond Shape
for (int i = 2; i <= n; i++) {
// Print leading spaces
for (int j = 0; j < n - i; j++) {
System.out.print(" ");
}
// Print stars
for (int j = 0; j < (2 * i - 1); j++) {
System.out.print("*");
}
// Move to the next line
System.out.println();
}
}
}