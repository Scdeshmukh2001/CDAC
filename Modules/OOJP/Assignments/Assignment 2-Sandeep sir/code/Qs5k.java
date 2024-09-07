public class Qs5k{
    public static void main(String[] args) {
        long num = 7L;
        
        String binaryString = Long.toBinaryString(num);
        String octalString = Long.toOctalString(num);
        String hexString = Long.toHexString(num);
        
        System.out.println("Binary representation of " + num + " is: " + binaryString);
        System.out.println("Octal representation of " + num + " is: " + octalString);
        System.out.println("Hexadecimal representation of " + num + " is: " + hexString);
    }
}

