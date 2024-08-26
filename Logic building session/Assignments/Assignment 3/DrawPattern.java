public class DrawPattern { 
public static void main(String[] args) { 
int rows = 5; // Number of rows 
int columns = 5; // Number of columns // Loop through each row 
for (int i = 0; i < rows; i++)
 {
// Loop through each column in the current row
 for (int j = 0; j < columns; j++) {
System.out.print("*"); // Print an asterisk without newline
}
System.out.println(); // Move to the next line after printing all columns
}
}
}