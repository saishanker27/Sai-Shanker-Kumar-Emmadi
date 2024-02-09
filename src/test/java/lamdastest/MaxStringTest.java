package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.MaxString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxStringTest extends TestCase {
    //true case
    public void testMaxString(){
        List<String> var = Arrays.asList("Oregon","Florida","Georgia");
        Assert.assertEquals("Oregon", MaxString.findMaxElement(var));
    }
    //null case
    public void testMaxString1(){
        List<String> var = new ArrayList<>(Collections.singletonList(null));
        Assert.assertEquals(null, MaxString.findMaxElement(var));
    }
}