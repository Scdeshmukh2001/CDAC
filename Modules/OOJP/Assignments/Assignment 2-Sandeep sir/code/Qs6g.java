public class Qs6g {
    public static void main(String[] args) {
        // Declare a method-local variable number of type float
        float number = 123.45f;
        
        // Convert the float to the corresponding wrapper class using Float.valueOf(float)
        Float wrapperNumber = Float.valueOf(number);
        
        // Print the wrapper class value
        System.out.println("The Float wrapper class value is: " + wrapperNumber);
    }
}

