package lamdastest;

import junit.framework.Assert;
import junit.framework.TestCase;
import lamdas.PositiveSquares;

import java.util.Arrays;
import java.util.List;

public class PositiveSquaresTest extends TestCase {
    //true case
    public void testSquares(){
        List<Integer> nums = Arrays.asList(3,4,1,5,6);
        Assert.assertEquals(87, PositiveSquares.calculatePositiveSumSquares(nums));
    }
    //zero case
    public void testSquares1(){
        List<Integer> nums = Arrays.asList(0);
        Assert.assertEquals(0, PositiveSquares.calculatePositiveSumSquares(nums));

    }
}