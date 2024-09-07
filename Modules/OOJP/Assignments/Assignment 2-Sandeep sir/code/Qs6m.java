public class Qs6m {
    public static void main(String[] args) {
        float floatValue = 123.45f;

        // Convert float to int
        int intValue = (int) floatValue;
        System.out.println("Float to int: " + intValue);

        // Convert float to double
        double doubleValue = floatValue;
        System.out.println("Float to double: " + doubleValue);

        // Convert float to long
        long longValue = (long) floatValue;
        System.out.println("Float to long: " + longValue);

        // Convert int to float
        int anotherIntValue = 100;
        float anotherFloatValue = (float) anotherIntValue;
        System.out.println("Int to float: " + anotherFloatValue);

        // Convert double to float
        double anotherDoubleValue = 456.78;
        float yetAnotherFloatValue = (float) anotherDoubleValue;
        System.out.println("Double to float: " + yetAnotherFloatValue);
    }
}
