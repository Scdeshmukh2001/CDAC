public class ReverseString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Java";

        System.out.println("Input: \"" + str1 + "\"");
        System.out.println("Output: \"" + reverseString(str1) + "\"");

        System.out.println("Input: \"" + str2 + "\"");
        System.out.println("Output: \"" + reverseString(str2) + "\"");
    }

    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
    }
}

