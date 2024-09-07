public class Qs8h {
    public static void main(String[] args) {
        // Declare a method-local variable strNumber of type String
        String strNumber = "123.45";
        
        // Convert the String to the corresponding wrapper class using Double.valueOf
        Double wrapperNumber = Double.valueOf(strNumber);
        
        // Print the wrapper class value
        System.out.println("The Double wrapper class value is: " + wrapperNumber);
    }
}

