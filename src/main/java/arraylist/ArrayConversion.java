package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Texas");
        arrayList.add("California");
        arrayList.add("Chicago");

        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);

        // Print the array
        System.out.println("Array elements: " + Arrays.toString(array));
    }
}