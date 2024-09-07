public class Qs8m {
    public static void main(String[] args) {
        double doubleValue = 123.45;

        // Convert double to int
        int intValue = (int) doubleValue;
        System.out.println("Double to int: " + intValue);

        // Convert double to float
        float floatValue = (float) doubleValue;
        System.out.println("Double to float: " + floatValue);

        // Convert double to long
        long longValue = (long) doubleValue;
        System.out.println("Double to long: " + longValue);

        // Convert double to byte
        byte byteValue = (byte) doubleValue;
        System.out.println("Double to byte: " + byteValue);

        // Convert int to double
        int anotherIntValue = 100;
        double anotherDoubleValue = (double) anotherIntValue;
        System.out.println("Int to double: " + anotherDoubleValue);

        // Convert float to double
        float anotherFloatValue = 50.5f;
        double anotherDoubleFromFloat = (double) anotherFloatValue;
        System.out.println("Float to double: " + anotherDoubleFromFloat);
    }
}
