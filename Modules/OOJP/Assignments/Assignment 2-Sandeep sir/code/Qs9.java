public class Qs9 {
    // Instance variables
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;
    char instanceChar;
    boolean instanceBoolean;

    // Static variables
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;
    static char staticChar;
    static boolean staticBoolean;

    public static void main(String[] args) {
        Qs9 obj = new Qs9();

        // Display instance variable default values
        System.out.println("Instance Variables:");
        System.out.println("byte: " + obj.instanceByte);
        System.out.println("short: " + obj.instanceShort);
        System.out.println("int: " + obj.instanceInt);
        System.out.println("long: " + obj.instanceLong);
        System.out.println("float: " + obj.instanceFloat);
        System.out.println("double: " + obj.instanceDouble);
        System.out.println("char: [" + obj.instanceChar + "]");
        System.out.println("boolean: " + obj.instanceBoolean);

        // Display static variable default values
        System.out.println("\nStatic Variables:");
        System.out.println("byte: " + staticByte);
        System.out.println("short: " + staticShort);
        System.out.println("int: " + staticInt);
        System.out.println("long: " + staticLong);
        System.out.println("float: " + staticFloat);
        System.out.println("double: " + staticDouble);
        System.out.println("char: [" + staticChar + "]");
        System.out.println("boolean: " + staticBoolean);
    }
}

