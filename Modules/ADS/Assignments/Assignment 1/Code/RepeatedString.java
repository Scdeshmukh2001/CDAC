import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class RepeatedString {
    public static List<Character> findRepeatedCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        List<Character> repeatedChars = new ArrayList<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Collect characters that appear more than once
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedChars.add(entry.getKey());
            }
        }

        return repeatedChars;
    }

    public static void main(String[] args) {
        String input1 = "programming";
        String input2 = "hello";

        System.out.println("Input: " + input1 + " Output: " + findRepeatedCharacters(input1));
        System.out.println("Input: " + input2 + " Output: " + findRepeatedCharacters(input2));
    }
}
