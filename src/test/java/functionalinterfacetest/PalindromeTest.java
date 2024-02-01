package functionalinterfacetest;

import junit.framework.Assert;
import junit.framework.TestCase;
import functionalinterface.Palindrome;

public class PalindromeTest extends TestCase {

    Palindrome p = new Palindrome();
    public void testCheck(){

        //true case
        Assert.assertEquals(1,p.palindromeCheck(121));
        //false case
        Assert.assertEquals(0,p.palindromeCheck(223));
        //null input
        Assert.assertEquals(0,p.palindromeCheck(' '));
    }
}
