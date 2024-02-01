package functionalinterfacetest;

import functionalinterface.RepeatedChar;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedCharTest extends TestCase {
    RepeatedChar val = new RepeatedChar();
    //true case
    public void testDuplicate(){
        Set<Character> orgchar = val.repeatedChar("Helloo");
        Set<Character> repchar = new HashSet<>(Arrays.asList('l','o'));
        Assert.assertEquals(orgchar,repchar);
    }
    public void testDuplicate2(){
        Set<Character> orgchar = val.repeatedChar("Chicago");
        Set<Character> repchar = new HashSet<>(Arrays.asList('c'));
        Assert.assertEquals(orgchar,repchar);
    }
    //false case
    public void testDuplicate3(){
        Set<Character> orgchar = val.repeatedChar("california");
        Set<Character> repchar = new HashSet<>(Arrays.asList('i','a'));
        Assert.assertNotSame(orgchar,repchar);
    }
}