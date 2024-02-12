package exceptiontest;

import junit.framework.Assert;
import junit.framework.TestCase;
import exceptions.FileReader;

import java.io.FileNotFoundException;

public class FileReaderTest extends TestCase {
    FileReader fileReader = new FileReader();
    public void testFileReader() {
        String output = fileReader.readFile("/Users/macbook/Sai-Shanker-Kumar-Emmadi/src/main/resources/Docs");
        Assert.assertEquals("Shanker", output);
    }
    public void testFileException() {
        try {
            fileReader.readFile("Docs.txt");
            fail("Expected RuntimeException, but no exception was thrown");
        } catch (RuntimeException e) {
            assertEquals("File not found", e.getMessage());
        }
    }
}