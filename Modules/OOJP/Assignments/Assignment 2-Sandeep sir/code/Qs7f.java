public class Qs7f {
    public static void main(String[] args) {
        // Declare a method-local variable strNumber of type String
        String strNumber = "Ab12Cd3";
        
        try {
            // Attempt to convert the String to a double using Double.parseDouble
            double number = Double.parseDouble(strNumber);
            System.out.println("The double value is: " + number);
        } catch (NumberFormatException e) {
            // Handle the exception
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}

