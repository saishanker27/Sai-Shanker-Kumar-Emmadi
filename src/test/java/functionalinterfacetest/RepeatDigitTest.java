package functionalinterfacetest;

import functionalinterface.RepeatDigit;
import junit.framework.Assert;
import junit.framework.TestCase;
import java.util.*;

public class RepeatDigitTest extends TestCase {
    RepeatDigit digit = new RepeatDigit();
    //true case
    public void testRepeat(){
        List<Integer> repeatedDigits = Arrays.asList(1,2);
        Assert.assertEquals(repeatedDigits,digit.repeatDigits(223111));
    }
    //false case
    public void testRepeat1(){
        List<Integer> repeatedDigits = Arrays.asList(2,1);
        Assert.assertNotSame(repeatedDigits,digit.repeatDigits(223111));
    }
    //null case
    public void testRepeat2(){
        List<Integer> repeatedDigits = Arrays.asList( );
        Assert.assertNotSame(repeatedDigits,digit.repeatDigits( ' '));
    }
}