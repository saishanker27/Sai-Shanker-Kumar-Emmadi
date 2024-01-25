package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.VowelCount;

public class VowelCountTest extends TestCase {

    public void testVowelCount(){
        int nullresult = VowelCount.countVowels("");
        Assert.assertEquals(0,nullresult);
        int novowels = VowelCount.countVowels("bdhgfs");
        Assert.assertEquals(0,novowels);
        int allvowels = VowelCount.countVowels("aeiou");
        Assert.assertEquals(5,allvowels);
        int uppercasevowels = VowelCount.countVowels("AEIOU");
        Assert.assertEquals(5,uppercasevowels);
        int mixedvowels = VowelCount.countVowels("aeiouAEIOU");
        Assert.assertEquals(10,mixedvowels);
    }
}