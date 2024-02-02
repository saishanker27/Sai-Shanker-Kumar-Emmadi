package functionalinterfacetest;

import functionalinterface.ReverseList;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseListTest extends TestCase {
    ReverseList rev = new ReverseList();
    //true case
    public void testReverse(){
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Chicago","Cali","Texas"));
        ArrayList<String> comparr = new ArrayList<>(Arrays.asList("Texas","Cali","Chicago"));
        Assert.assertEquals(comparr,rev.reverseList(arr));
    }
    //false case
    public void testReverse1(){
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Chicago","Texas","Cali"));
        ArrayList<String> comparr = new ArrayList<>(Arrays.asList("Texas","Cali","Chicago"));
        Assert.assertNotSame(comparr,rev.reverseList(arr));
    }
    //null case
    public void testReverse2(){
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Chicago",null,"Cali"));
        ArrayList<String> comparr = new ArrayList<>(Arrays.asList("Chicago",null,"Cali"));
        Assert.assertNotSame(comparr,rev.reverseList(arr));
    }
}
