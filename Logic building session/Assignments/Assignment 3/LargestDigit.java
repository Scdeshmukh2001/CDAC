public class LargestDigit { 
public static void main(String[] args) {
 int number = 4825; // The number to analyze
int largestDigit = 0; // Initialize largest digit to 0
// Process each digit of the number 
while (number > 0) {
int digit = number % 10; // Extract the last digit 
if (digit > largestDigit) {
largestDigit = digit; // Update largest digit if current digit is larger
}
number /= 10; // Remove the last digit from the number
}
System.out.println("The largest digit is: " + largestDigit);
}
}