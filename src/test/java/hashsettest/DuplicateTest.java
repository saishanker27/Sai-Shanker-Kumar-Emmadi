package hashsettest;

import hashset.DuplicateChar;
import junit.framework.Assert;
import junit.framework.TestCase;

public class DuplicateTest extends TestCase {
    DuplicateChar val = new DuplicateChar();
    public void testDuplicate(){

        //true case
        Assert.assertEquals("alis",val.noDuplicate("alias"));
        Assert.assertEquals("sai",val.noDuplicate("saiS"));

        //false case
        Assert.assertNotSame("ais",val.noDuplicate("sai"));

        //null case
        Assert.assertNotSame(" ",val.noDuplicate(" "));
        Assert.assertNotSame(" ",val.noDuplicate(null));

    }
}