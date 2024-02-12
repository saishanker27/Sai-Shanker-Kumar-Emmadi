package exceptiontest;

import exceptions.Main;
import junit.framework.Assert;
import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main main = new Main(1000);

    public void testWithdrawal() {
        assertTrue(main.getWithdrawalStatus(240.00));
        assertEquals(760.0, main.getCurrentBalance(), 0.01);
    }
    public void testException() {
        try {
            main.getWithdrawalStatus(1200.00);
            fail("Expected RuntimeException, but no exception was thrown");
        } catch (RuntimeException e) {
            assertEquals("Insufficient balance", e.getCause().getMessage());
        }
    }
    public void testWithInvalidAmount() {
        try {
            main.getWithdrawalStatus(-200.00);
            fail("Expected RuntimeException, but no exception was thrown");
        } catch (RuntimeException e) {
            assertEquals("Invalid Withdrawal", e.getCause().getMessage());
        }
    }
}