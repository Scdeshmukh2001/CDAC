public class Qs3f {
    public static void main(String[] args) {
        
        String strNumber = "Ab12Cd3";
        
        try {
            
            short number = Short.parseShort(strNumber);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}

