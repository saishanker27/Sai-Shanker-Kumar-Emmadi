package functionalinterfacetest;

import functionalinterface.RotationCheck;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RotationCheckTest extends TestCase {
    public void testRotation(){
        //true case
        Assert.assertTrue(RotationCheck.isRotation("abcd","bcda"));
        Assert.assertTrue(RotationCheck.isRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));

        //false case
        Assert.assertFalse(RotationCheck.isRotation("abcd","bdca"));

        //null case
        Assert.assertTrue(RotationCheck.isRotation(" "," "));
    }
}