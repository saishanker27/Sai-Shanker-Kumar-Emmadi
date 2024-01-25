package stringstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import strings.CheckRotation;

public class RotationTest extends TestCase {
    public void testRotate(){
        boolean equal = CheckRotation.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        Assert.assertTrue(equal);
        boolean nullresult = CheckRotation.isRotation("","");
        Assert.assertFalse(nullresult);
        boolean falseresult = CheckRotation.isRotation("java","vaj");
        Assert.assertFalse(falseresult);
        boolean falseresult2 = CheckRotation.isRotation("","java");
        Assert.assertFalse(falseresult2);
    }
}