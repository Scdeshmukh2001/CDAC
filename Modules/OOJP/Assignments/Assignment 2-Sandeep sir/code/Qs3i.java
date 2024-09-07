public class Qs3i{
    public static void main(String[] args) {
        short myShort = 100;

        // Converting short to other primitive types
        int myInt = myShort; // Automatic widening conversion
        long myLong = myShort; // Automatic widening conversion
        float myFloat = myShort; // Automatic widening conversion
        double myDouble = myShort; // Automatic widening conversion

        System.out.println("short to int: " + myInt);
        System.out.println("short to long: " + myLong);
        System.out.println("short to float: " + myFloat);
        System.out.println("short to double: " + myDouble);

        // Converting other primitive types to short
        myInt = 100;
        myShort = (short) myInt; // Manual narrowing conversion
        System.out.println("int to short: " + myShort);

        myLong = 100L;
        myShort = (short) myLong; // Manual narrowing conversion
        System.out.println("long to short: " + myShort);

        myFloat = 100.0f;
        myShort = (short) myFloat; // Manual narrowing conversion
        System.out.println("float to short: " + myShort);

        myDouble = 100.0;
        myShort = (short) myDouble; // Manual narrowing conversion
        System.out.println("double to short: " + myShort);
    }
}
