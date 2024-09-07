public class Qs5l {
    public static void main(String[] args) {
        long longValue = 123456789L;

        
        int intValue = (int) longValue;
        short shortValue = (short) longValue;
        byte byteValue = (byte) longValue;
        float floatValue = longValue;
        double doubleValue = longValue;

        int anotherIntValue = 98765;
        long fromInt = (long) anotherIntValue;

        short anotherShortValue = 12345;
        long fromShort = (long) anotherShortValue;

        byte anotherByteValue = 123;
        long fromByte = (long) anotherByteValue;

        float anotherFloatValue = 12345.67F;
        long fromFloat = (long) anotherFloatValue;

        double anotherDoubleValue = 12345.6789;
        long fromDouble = (long) anotherDoubleValue;

        // Print the results
        System.out.println("Original long value: " + longValue);
        System.out.println("Converted to int: " + intValue);
        System.out.println("Converted to short: " + shortValue);
        System.out.println("Converted to byte: " + byteValue);
        System.out.println("Converted to float: " + floatValue);
        System.out.println("Converted to double: " + doubleValue);

        System.out.println("Original int value: " + anotherIntValue);
        System.out.println("Converted from int to long: " + fromInt);
        System.out.println("Original short value: " + anotherShortValue);
        System.out.println("Converted from short to long: " + fromShort);
        System.out.println("Original byte value: " + anotherByteValue);
        System.out.println("Converted from byte to long: " + fromByte);
        System.out.println("Original float value: " + anotherFloatValue);
        System.out.println("Converted from float to long: " + fromFloat);
        System.out.println("Original double value: " + anotherDoubleValue);
        System.out.println("Converted from double to long: " + fromDouble);
    }
}

