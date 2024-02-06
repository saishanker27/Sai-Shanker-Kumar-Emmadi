package exceptionstest;

import exceptions.IntException;
import junit.framework.Assert;
import junit.framework.TestCase;

public class IntExceptionTest extends TestCase {
    IntException val = new IntException();
    public void testException(){
        Assert.assertEquals(23,val.convertToInt("23"));
        Assert.assertEquals(-1,val.convertToInt("45.67"));
        Assert.assertEquals(-1,val.convertToInt("test"));
        Assert.assertEquals(-1,val.convertToInt("123f"));
    }
}