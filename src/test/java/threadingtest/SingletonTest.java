package threadingtest;
import junit.framework.Test;
import junit.framework.TestCase;
import threading.Singleton;

public class SingletonTest extends TestCase {
    public void testSingletonInstance() {
        // Get the singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same object
        assertEquals("Both instances should be the same object", instance1, instance2);
    }

    public void testSingletonOperation() {
        // Get the singleton instance
        Singleton instance = Singleton.getInstance();
        // Perform an operation
        instance.performOperation();
        // Add more assertions if needed
    }
}