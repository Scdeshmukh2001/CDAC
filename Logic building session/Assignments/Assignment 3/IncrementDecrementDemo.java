public class IncrementDecrementDemo { 
public static void main(String[] args) { 
int a = 5; int b = 10;
int result;
// Using both pre-increment and post-decrement operators 
result = ++a + b-- - --b + a--;
// Printing the results of the operations
System.out.println("a after operations: " + a);
System.out.println("b after operations: " + b);
System.out.println("Result of the expression: " + result);
}
}