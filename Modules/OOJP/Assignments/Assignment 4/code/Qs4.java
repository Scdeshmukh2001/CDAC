public class Qs4 {
    public static void main(String[] args) {
        // Declare an int variable
        int intValue = 42;

        // Widening conversion from int to double
        double doubleValue = intValue;

        // Widening conversion from int to float
        float floatValue = intValue;

        // Conversion from int to String
        String stringValue = Integer.toString(intValue);

        // Manual conversion from int to boolean (example: non-zero is true, zero is false)
        boolean booleanValue = (intValue != 0);

        // Print the results
        System.out.println("Original int value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to String: " + stringValue);
        System.out.println("Converted to boolean: " + booleanValue);
    }
}

