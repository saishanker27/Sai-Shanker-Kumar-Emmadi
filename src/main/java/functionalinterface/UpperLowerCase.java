package functionalinterface;

import static java.util.Objects.isNull;

public class UpperLowerCase {

    public static String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        if(isNull(input))
            return null;
        else {
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}