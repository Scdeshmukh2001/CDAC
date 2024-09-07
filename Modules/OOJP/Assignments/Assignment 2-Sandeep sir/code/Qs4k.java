public class Qs4k {
    public static void main(String[] args) {
        int number = 7;

        // Convert to binary
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary: " + binaryString);

        // Convert to octal
        String octalString = Integer.toOctalString(number);
        System.out.println("Octal: " + octalString);

        // Convert to hexadecimal
        String hexString = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hexString);
    }
}

