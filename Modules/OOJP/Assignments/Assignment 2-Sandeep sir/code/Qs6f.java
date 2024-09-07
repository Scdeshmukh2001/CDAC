public class Qs6f {
    public static void main(String[] args) {
        // Declare a method-local variable strNumber of type String
        String strNumber = "Ab12Cd3";
        
        try {
            // Attempt to convert the String to a float using Float.parseFloat(String)
            float floatNumber = Float.parseFloat(strNumber);
            System.out.println("The float value is: " + floatNumber);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}

