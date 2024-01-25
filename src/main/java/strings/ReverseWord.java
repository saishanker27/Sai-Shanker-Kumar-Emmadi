package strings;

public class ReverseWord{
    public static void main(String[] args) {

        String inputSentence = "Java J2EE Reverse Me";

        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
