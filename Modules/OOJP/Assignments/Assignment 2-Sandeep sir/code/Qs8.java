public class Qs8 {
    public static void main(String[] args) {
        // Initialize variables of each primitive type
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
        float floatValue = 50.5f;
        double doubleValue = 60.6;
        char charValue = 'A';
        boolean booleanValue = true;

        // Convert using toString method of wrapper class
        String byteStr1 = Byte.toString(byteValue);
        String shortStr1 = Short.toString(shortValue);
        String intStr1 = Integer.toString(intValue);
        String longStr1 = Long.toString(longValue);
        String floatStr1 = Float.toString(floatValue);
        String doubleStr1 = Double.toString(doubleValue);
        String charStr1 = Character.toString(charValue);
        String booleanStr1 = Boolean.toString(booleanValue);

        // Convert using valueOf method of String class
        String byteStr2 = String.valueOf(byteValue);
        String shortStr2 = String.valueOf(shortValue);
        String intStr2 = String.valueOf(intValue);
        String longStr2 = String.valueOf(longValue);
        String floatStr2 = String.valueOf(floatValue);
        String doubleStr2 = String.valueOf(doubleValue);
        String charStr2 = String.valueOf(charValue);
        String booleanStr2 = String.valueOf(booleanValue);

        // Print results
        System.out.println("Using toString method:");
        System.out.println("Byte: " + byteStr1);
        System.out.println("Short: " + shortStr1);
        System.out.println("Int: " + intStr1);
        System.out.println("Long: " + longStr1);
        System.out.println("Float: " + floatStr1);
        System.out.println("Double: " + doubleStr1);
        System.out.println("Char: " + charStr1);
        System.out.println("Boolean: " + booleanStr1);

        System.out.println("\nUsing valueOf method:");
        System.out.println("Byte: " + byteStr2);
        System.out.println("Short: " + shortStr2);
        System.out.println("Int: " + intStr2);
        System.out.println("Long: " + longStr2);
        System.out.println("Float: " + floatStr2);
        System.out.println("Double: " + doubleStr2);
        System.out.println("Char: " + charStr2);
        System.out.println("Boolean: " + booleanStr2);
    }
}
