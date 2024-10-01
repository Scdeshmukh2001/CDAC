public class LeapYear {
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4 but not by 100,
        // except if it is also divisible by 400.
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int input1 = 2020;
        int input2 = 1900;

        System.out.println("Input: " + input1 + " Output: " + isLeapYear(input1));
        System.out.println("Input: " + input2 + " Output: " + isLeapYear(input2));
    }
}

