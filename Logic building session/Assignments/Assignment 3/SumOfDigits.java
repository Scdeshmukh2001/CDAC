public class SumOfDigits {
 public static void main(String[] args) {
int number = 9876; // Number whose digits we want to sum 
int sum = 0; 
// Initialize sum to 0
// Loop to calculate the sum of digits 
while (number > 0) {
int digit = number % 10; // Extract the last digit 
sum += digit; // Add digit to sum
number /= 10; // Remove the last digit from the number
}
System.out.println("The sum of the digits is:" + sum);
}
}