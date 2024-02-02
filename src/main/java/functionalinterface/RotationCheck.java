package functionalinterface;
import java.lang.*;

import static java.util.Objects.isNull;

public class RotationCheck {
    public static boolean isRotation(String str1, String str2) {

        if (isNull(str1) ||  isNull(str2) || str1.length() != str2.length() || str1.length() == 0 ) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}