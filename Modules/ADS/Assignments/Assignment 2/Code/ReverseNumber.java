public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reversed = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed * sign;
    }

    public static void main(String[] args) {
        int input1 = 12345;
        int input2 = -9876;

        System.out.println("Input: " + input1);
        System.out.println("Output: " + reverseNumber(input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + reverseNumber(input2));
    }
}

