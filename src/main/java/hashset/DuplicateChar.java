package hashset;

import java.util.HashSet;

import static java.util.Objects.isNull;

public class DuplicateChar {
    public String noDuplicate(String str){
        HashSet<Character> hset = new HashSet<>();
        //adding each element from chararray to the hash set
        //creating string builder and append characters to string builder

        StringBuilder stringBuilder = new StringBuilder();
        if(!isNull(str)) {
            for (char c : str.toLowerCase().toCharArray()) {
                if (hset.add(c))
                    stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}