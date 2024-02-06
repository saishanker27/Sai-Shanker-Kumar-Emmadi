package lamdastest;
import junit.framework.TestCase;
import lamdas.Addition;
import lamdas.MathOperation;


public class AdditionTest extends TestCase {

    public void testPerformAddition() {
        Addition calculator = new Addition();

        // Test case 1: Check if the addition is performed correctly
        MathOperation addition = (a, b) -> a + b;
        int result1 = calculator.performAddition(addition, 5, 3);
        assertEquals(8, result1);

        // Test case 2: Check with negative numbers
        MathOperation addition2 = (a, b) -> a + b;
        int result2 = calculator.performAddition(addition2, -5, -3);
        assertEquals(-8, result2);

        // Add more test cases as needed
    }
}