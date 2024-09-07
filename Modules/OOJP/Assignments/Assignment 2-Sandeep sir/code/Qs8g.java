public class Qs8g {
    public static void main(String[] args) {
        // Declare a method-local variable number of type double
        double number = 123.45;
        
        // Convert the double to the corresponding wrapper class using Double.valueOf
        Double wrapperNumber = Double.valueOf(number);
        
        // Print the wrapper class value
        System.out.println("The Double wrapper class value is: " + wrapperNumber);
    }
}

