public class Qs4l {
    public static void main(String[] args) {
        int number = 42;

        // Convert int to other primitive types
        byte byteValue = (byte) number;
        short shortValue = (short) number;
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;
        char charValue = (char) number;
        boolean booleanValue = (number != 0);

        // Print the converted values
        System.out.println("Original int value: " + number);
        System.out.println("Converted to byte: " + byteValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to char: " + charValue);
        System.out.println("Converted to boolean: " + booleanValue);

        // Convert other primitive types back to int
        int fromByte = byteValue;
        int fromShort = shortValue;
        int fromLong = (int) longValue;
        int fromFloat = (int) floatValue;
        int fromDouble = (int) doubleValue;
        int fromChar = charValue;

        // Print the values converted back to int
        System.out.println("Converted back from byte: " + fromByte);
        System.out.println("Converted back from short: " + fromShort);
        System.out.println("Converted back from long: " + fromLong);
        System.out.println("Converted back from float: " + fromFloat);
        System.out.println("Converted back from double: " + fromDouble);
        System.out.println("Converted back from char: " + fromChar);
    }
}
