package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.StringVowel;

import java.util.Map;

public class StringVowelTest extends TestCase {

    public void testCountVowels() {
        String[] strings = {"hello", "world", "java", "programming"};

        Map<String, Long> result = StringVowel.countVowelsInStrings(strings);
        Assert.assertEquals(2, (long) result.get("hello"));
        Assert.assertEquals(1, (long) result.get("world"));
        Assert.assertEquals(2, (long) result.get("java"));
        Assert.assertEquals(3, (long) result.get("programming"));
    }
    public void testCountVowelsEmptyArray() {
        String[] strings = {};

        Map<String, Long> result = StringVowel.countVowelsInStrings(strings);

        Assert.assertTrue(result.isEmpty());
    }

    public void testCountVowelsInStringsNullString() {
        String[] strings = {null};
        Map<String, Long> result = StringVowel.countVowelsInStrings(strings);
        Assert.assertTrue(result.containsKey(null));
        Assert.assertEquals(0, (long) result.get(null));
    }
}