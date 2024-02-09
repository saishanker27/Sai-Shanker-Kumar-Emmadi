package threading;
public class EvenOddPrinter {
    public void printOddEvenNumbers() {
        // Creating two threads
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }
}