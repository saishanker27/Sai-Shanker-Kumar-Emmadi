package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.RemoveDuplicate;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateTest extends TestCase {
    //true case
    public void testDuplicate(){
        List<Integer> vals = Arrays.asList(1,1,2,3,100,3,35);
        List<Integer> compvals = Arrays.asList(1,2,3,100,35);
        Assert.assertEquals(compvals, RemoveDuplicate.removeDuplicates(vals));
    }
    //false case
    public void testDuplicate1(){
        List<Integer> vals = Arrays.asList(1,1,2,3,100,3,35);
        List<Integer> compvals = Arrays.asList(1,2,3,35,100);
        Assert.assertNotSame(compvals, RemoveDuplicate.removeDuplicates(vals));
    }
    //null case
    public void testDuplicate2(){
        List<Integer> vals = Arrays.asList();
        List<Integer> compvals = Arrays.asList();
        Assert.assertNotSame(compvals, RemoveDuplicate.removeDuplicates(vals));
    }
}