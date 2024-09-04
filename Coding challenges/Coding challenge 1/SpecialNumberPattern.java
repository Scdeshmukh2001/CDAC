public class SpecialNumberPattern {
    public static void main(String[] args) {
        int n = 9; // Number of rows
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat("1", i) + " x 8 + " + i + " = " + repeat("9", i));
        }
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}

