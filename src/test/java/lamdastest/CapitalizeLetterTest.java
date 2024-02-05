package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.CapitalizeLetter;

public class CapitalizeLetterTest extends TestCase {
    CapitalizeLetter letter = new CapitalizeLetter();
    //true case
    public void testCapitalize(){
        String[] str = {"texas", "cali"};
        String[] compstr = {"Cali", "Texas"};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        for (int i = 0; i < str.length; i++) {
            Assert.assertEquals(compstr[i],res[i]);
        }
    }
    //false case
    public void testCapitalize1(){
        String[] str = {"texas", "cali"};
        String[] compstr = {"Cali", "texas"};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        for (int i = 0; i < str.length; i++) {
            Assert.assertNotSame(compstr[i],res[i]);
        }
    }
    public void testCapitalize2(){
        String[] str = {null};
        String[] compstr = {null};
        String[] res = letter.capitalizeAndPrintAlphabetically(str);
        for (int i = 0; i < str.length; i++) {
            Assert.assertEquals(compstr[i],res[i]);
        }
    }
}