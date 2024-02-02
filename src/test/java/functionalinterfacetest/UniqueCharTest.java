package functionalinterfacetest;

import functionalinterface.UniqueChar;
import junit.framework.Assert;
import junit.framework.TestCase;

public class UniqueCharTest extends TestCase {

    UniqueChar ch = new UniqueChar();
    public void testUnique(){
        //true case
        Assert.assertEquals(6,ch.uniqueChar("Java is used for programming and java"));
        //false case
        Assert.assertNotSame(7,ch.uniqueChar("Java is used for programming and java"));
        //null case
        Assert.assertEquals(0,ch.uniqueChar(" "));

    }
}