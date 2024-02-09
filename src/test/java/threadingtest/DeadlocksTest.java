package threadingtest;
import junit.framework.TestCase;
import threading.Deadlocks;
public class DeadlocksTest extends TestCase {

    public void testDeadlock() throws InterruptedException {
        Deadlocks example = new Deadlocks();

        // Create and start two threads
        Thread thread1 = new Thread(() -> example.method1());
        Thread thread2 = new Thread(() -> example.method2());
        thread1.start();
        thread2.start();

        // Join the threads to wait for their completion
        thread1.join();
        thread2.join();
    }
}