public class GCD {
    public static void main(String[] args) {
        int a = 54;
        int b = 24;
        System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));
        
        a = 17;
        b = 13;
        System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

