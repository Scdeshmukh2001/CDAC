public class FirstFivePrimes { 
public static void main(String[] args) {
int count = 0; // To keep track of the number of primes found 
int number = 2; // The number to check for primality
// Continue until we find the first 5 prime numbers 
while (count < 5) { 
if (isPrime(number)) {
System.out.println(number); // Print the prime number 
count++; // Increment the count of primes found
}
number++; // Move to the next number
}
}
// Method to check if a number is prime 
public static boolean isPrime(int num) { 
if (num <= 1) { 
return false; // Numbers less than or equal to 1 are not prime
}
for (int i = 2; i <= Math.sqrt(num); i++) { 
if (num % i == 0) { 
return false; // Number is divisible by i, so it's not prime
}
}
return true; // Number is prime
}
}