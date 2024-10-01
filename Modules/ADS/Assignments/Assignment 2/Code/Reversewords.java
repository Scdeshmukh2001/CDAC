public class Reversewords {
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate over the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "Java Programming";

        System.out.println("Input: " + input1);
        System.out.println("Output: " + reverseWords(input1));

        System.out.println("Input: " + input2);
        System.out.println("Output: " + reverseWords(input2));
    }
}

