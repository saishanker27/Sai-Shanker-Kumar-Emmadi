package functionalinterfacetest;

import junit.framework.TestCase;
import functionalinterface.Swap;
import junit.framework.Assert;


public class SwapTest extends TestCase {
    Swap s = new Swap();
    //true case
    public void testSwap() {
        int[] values = {5, 10};
        s.swapVal(values);

        Assert.assertEquals(10,values[0]);
        Assert.assertEquals(5,values[1]);
    }
    //false case
    public void testSwap2() {
        int[] values = {5, 10};
        s.swapVal(values);

        Assert.assertNotSame(5,values[0]);
        Assert.assertNotSame(10,values[1]);
    }
    //null case
    public void testSwap3() {
        int[] values = {' ', 10};
        s.swapVal(values);
        Assert.assertEquals(10,values[0]);
        Assert.assertEquals(' ',values[1]);
    }
}
