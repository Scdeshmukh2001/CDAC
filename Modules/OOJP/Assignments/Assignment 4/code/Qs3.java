public class Qs3 {
    public static void main(String[] args) {
        // Declare variables of different data types
        int intValue = 10;
        double doubleValue = 5.5;
        float floatValue = 3.3f;

        // Perform arithmetic operations
        double result1 = intValue + doubleValue; // int to double
        float result2 = intValue + floatValue;   // int to float
        double result3 = floatValue + doubleValue; // float to double

        // Print the results
        System.out.println("Result of int + double: " + result1);
        System.out.println("Result of int + float: " + result2);
        System.out.println("Result of float + double: " + result3);
    }
}

