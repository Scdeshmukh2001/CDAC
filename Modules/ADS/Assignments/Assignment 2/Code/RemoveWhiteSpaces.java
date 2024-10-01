public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "  Java   Programming  ";
        
        System.out.println("Original: \"" + str1 + "\" -> Without spaces: \"" + removeWhiteSpaces(str1) + "\"");
        System.out.println("Original: \"" + str2 + "\" -> Without spaces: \"" + removeWhiteSpaces(str2) + "\"");
    }

    public static String removeWhiteSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}

