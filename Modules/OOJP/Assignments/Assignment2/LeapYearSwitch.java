import java.util.Scanner;

public class LeapYearSwitch {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        switch (isLeapYear(year)) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
        }
    }

    public static int isLeapYear(int year) {
        int result;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                result = (year % 400 == 0) ? 1 : 0;
            } else {
                result = 1;
            }
        } else {
            result = 0;
        }
        return result;
    }
}
