class Factorial {
public static void main(String[] args) {
 int number = 10; // Number to compute the factorial of 
long factorial = 1; // Initialize factorial to 1
// Loop to calculate the factorial 
for (int i = 1; i <= number; i++){ 
factorial *= i; // Multiply factorial by i
}
System.out.println("The factorial of " + number + " is: " + factorial);
}
}