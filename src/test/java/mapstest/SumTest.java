package mapstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import maps.Sum;

public class SumTest extends TestCase {
    //true case
    public void testSum(){
        Sum s = new Sum();
        int [] nums = {10,20,30,40,50,60};
        int target = 100;
        int[] a = {3,5};
        for (int i = 0; i < a.length; i++) {
            Assert.assertEquals(a[i], s.twoSumIndices(nums, target)[i]);
        }
    }
    //false case
    public void testSum2(){
        Sum s = new Sum();
        int [] nums = {10,20,30,40,50,60};
        int target = 100;
        int[] a = {2,4};
        for (int i = 0; i < a.length; i++) {
            Assert.assertNotSame(a[i], s.twoSumIndices(nums, target)[i]);
        }
    }
    //Empty Output Case
    public void testSum3(){
        Sum s = new Sum();
        int [] nums = {10,20,30,40,50,70};
        int target = 100;
        int[] a = { };
        for (int i = 0; i < a.length; i++) {
            Assert.assertSame(a[i], s.twoSumIndices(nums, target)[i]);
        }
    }
}
