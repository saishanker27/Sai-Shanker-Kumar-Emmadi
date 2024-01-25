package arraylisttest;
import arraylist.Student;
import junit.framework.Assert;
import junit.framework.TestCase;
import java.util.ArrayList;
import arraylist.RemoveStudentsBelowAverage;

public class StudentTest extends TestCase{


    public void testRemoveBelowAverageGPA() {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Cruz", 3.5));
        studentList.add(new Student("Dave", "Smith", 3.2));
        studentList.add(new Student("Jessie", "Johnson", 3.8));

        // Create an instance of the class to test
        RemoveStudentsBelowAverage remover = new RemoveStudentsBelowAverage();

        // Test removing students with GPA below average
        remover.removeBelowAverageGPA(studentList);

        // Verify the remaining students
        assertEquals(2, studentList.size());
        assertEquals("John", studentList.get(0).firstName);
    }
}