public class ReverseDigits {
public static void main(String[] args) { 
int number = 1234; // Number to reverse
int reversed = 0; // Variable to store the reversed number
while (number != 0) {
int digit = number % 10; // Extract the last digit 
reversed = reversed * 10 + digit; // Append digit to reversed number 
number = number / 10; // Remove the last digit from the original number
}
System.out.println("The reversed number is: " + reversed);
}
}