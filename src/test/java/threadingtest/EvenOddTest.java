package threadingtest;

import junit.framework.Assert;
import junit.framework.TestCase;
import threading.EvenPrinter;
import threading.OddPrinter;

import java.util.List;

public class EvenOddTest extends TestCase{

    public void testEvenPrinter() {
        EvenPrinter evenPrinter = new EvenPrinter();
        Thread evenThread = new Thread(evenPrinter);
        evenThread.start();

        try {
            evenThread.join(); // Wait for evenThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> evenNumbers = EvenPrinter.getEvenNumbers();
        Assert.assertEquals(30, evenNumbers.size());
        Assert.assertEquals(2, evenNumbers.get(0).intValue());
        Assert.assertEquals(60, evenNumbers.get(evenNumbers.size() - 1).intValue());
    }

    public void testOddPrinter() {
        OddPrinter oddPrinter = new OddPrinter();
        Thread oddThread = new Thread(oddPrinter);
        oddThread.start();

        try {
            oddThread.join(); // Wait for oddThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Integer> oddNumbers = OddPrinter.getOddNumbers();
        Assert.assertEquals(30, oddNumbers.size());
        Assert.assertEquals(1, oddNumbers.get(0).intValue());
        Assert.assertEquals(59, oddNumbers.get(oddNumbers.size() - 1).intValue());
    }
}