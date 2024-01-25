package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    public static String[] arrayConversion(ArrayList<Student> studentList) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);
        return array;

    }
}