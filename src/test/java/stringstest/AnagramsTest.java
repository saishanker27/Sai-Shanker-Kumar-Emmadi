package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.Anagram;

public class AnagramsTest extends TestCase {
    public void testAnagrams() {
        boolean nullresult = Anagram.areAnagrams(null, null);
        Assert.assertFalse(nullresult);
        boolean notlen = Anagram.areAnagrams("less", "les");
        Assert.assertFalse(notlen);
        boolean equal = Anagram.areAnagrams("silent", "listen");
        Assert.assertTrue(equal);
        boolean uppercaseequal = Anagram.areAnagrams("silent", "liSTen");
        Assert.assertTrue(uppercaseequal);
    }
}