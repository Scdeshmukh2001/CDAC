import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    public static Character findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // Return null if no non-repeated character is found
    }

    public static void main(String[] args) {
        String input1 = "stress";
        String input2 = "aabbcc";

        System.out.println("Input: " + input1 + " Output: " + findFirstNonRepeatedCharacter(input1));
        System.out.println("Input: " + input2 + " Output: " + findFirstNonRepeatedCharacter(input2));
    }
}

