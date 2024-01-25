package arraylisttest;

import arraylist.TraverseArray;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseTest extends TestCase{
    TraverseArray traverselist = new TraverseArray();
    public void testTraverse() {

        //for loop true case
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Chicago", "Texas", "Cali"));
        List<String> expectedListOutput = Arrays.asList("Chicago", "Texas", "Cali");
        Assert.assertEquals(expectedListOutput, traverselist.traverseWithForLoop(employeeList));
    }
    //enhanced for loop true case
    public void testTraverse2(){
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Chicago", "Texas", "Cali"));
        List<String> expectedListOutput = Arrays.asList("Chicago", "Texas", "Cali");
        Assert.assertEquals(expectedListOutput, traverselist.traverseWithEnhancedForLoop(employeeList));
    }
    //for and enhanced fail case
    public void testTraverse3(){
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Chicago", "Texas", "Cali"));
        List<String> expectedListOutput = Arrays.asList("Chicago", "Texas", "Cal");
        Assert.assertNotSame(expectedListOutput, traverselist.traverseWithForLoop(employeeList));
        Assert.assertNotSame(expectedListOutput, traverselist.traverseWithEnhancedForLoop(employeeList));
    }

}