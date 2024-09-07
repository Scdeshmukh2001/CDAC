public class Qs2i {
    public static void main(String[] args) {
        // Declare a byte value
        byte byteValue = 42;

        // Convert byte to other primitive types
        int intValue = byteValue;
        short shortValue = byteValue;
        long longValue = byteValue;
        float floatValue = byteValue;
        double doubleValue = byteValue;
        char charValue = (char) byteValue;
        boolean booleanValue = (byteValue != 0);

        // Print the converted values
        System.out.println("Byte value: " + byteValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to long: " + longValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);
        System.out.println("Converted to char: " + charValue);
        System.out.println("Converted to boolean: " + booleanValue);

        // Convert other primitive types to byte
        byte fromInt = (byte) intValue;
        byte fromShort = (byte) shortValue;
        byte fromLong = (byte) longValue;
        byte fromFloat = (byte) floatValue;
        byte fromDouble = (byte) doubleValue;
        byte fromChar = (byte) charValue;

        // Print the converted byte values
        System.out.println("Converted from int: " + fromInt);
        System.out.println("Converted from short: " + fromShort);
        System.out.println("Converted from long: " + fromLong);
        System.out.println("Converted from float: " + fromFloat);
        System.out.println("Converted from double: " + fromDouble);
        System.out.println("Converted from char: " + fromChar);
    }
}

