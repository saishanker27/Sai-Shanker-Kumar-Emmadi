package functionalinterface;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    public int uniqueChar(String str) {
        Map<String, Integer> countMap = new HashMap<>();
        String st = str.toLowerCase();
        // Split the input string into words
        String[] words = st.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            // If the word is already in the map, increment its count; otherwise, set count to 1
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        return countMap.size();
    }
}