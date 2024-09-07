public class Qs6k {
    public static void main(String[] args) {
        float num = -25.0f;

        // Math.sqrt() returns NaN for negative values
        double sqrtValue = Math.sqrt(num);

        System.out.println("Square root of " + num + " is: " + sqrtValue);
    }
}
