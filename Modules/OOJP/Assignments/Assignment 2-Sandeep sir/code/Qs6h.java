public class Qs6h{
    public static void main(String[] args) {
        // Declare a method-local variable strNumber of type String
        String strNumber = "123.45";
        
        // Convert the String to the corresponding wrapper class using Float.valueOf(String)
        Float wrapperNumber = Float.valueOf(strNumber);
        
        // Print the wrapper class value
        System.out.println("The Float wrapper class value is: " + wrapperNumber);
    }
}
