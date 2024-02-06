package lamdastest;

import junit.framework.TestCase;
import lamdas.ArrayOrderSort;

import java.util.Arrays;
import java.util.List;

public class ArrayOrderTest extends TestCase {

    public void testSortBasedOnLength() {
        ArrayOrderSort arrayOrderSort = new ArrayOrderSort();

        // Test case 1: Check if the method correctly sorts an array of strings
        String[] inputArray1 = {"apple", "banana", "kiwi", "orange", "grape", "melon"};
        List<String> result1 = arrayOrderSort.sortBasedOnLength(inputArray1);
        List<String> expected1 = Arrays.asList("kiwi",  "melon", "apple", "grape", "orange", "banana");
        assertEquals(expected1, result1);

        // Test case 2: Check if the method handles an empty array
        String[] inputArray2 = {};
        List<String> result2 = arrayOrderSort.sortBasedOnLength(inputArray2);
        List<String> expected2 = Arrays.asList();
        assertEquals(expected2, result2);

    }
}