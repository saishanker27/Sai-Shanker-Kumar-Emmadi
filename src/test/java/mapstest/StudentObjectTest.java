package mapstest;

import junit.framework.TestCase;
import maps.ReturnStudentObject;
import maps.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentObjectTest extends TestCase {
    ReturnStudentObject obj = new ReturnStudentObject();
    String[] firstnames = {"a", "b","c","d","e","f","g","h"};
    String[] lastnames = {"q", "v","w","x","y","z","k","j"};
    double[] gpa = {3.0,3.1,3.2,3.3,3.4,3.5,3.6,3.7};
    HashMap<String, Student> studentobj = new HashMap<>();
    public void testStudentObjects() {
        // Assuming Student class has a constructor that takes first name, last name, and GPA
        for (int i = 0; i < firstnames.length; i++) {
            studentobj.put(firstnames[i], new Student(firstnames[i], lastnames[i], gpa[i]));
        }
        //true case
        assertEquals(studentobj.get("a") ,obj.returnStudentObj(studentobj,"a"));
        assertEquals(studentobj.get("f") ,obj.returnStudentObj(studentobj,"f"));

        //false case
        assertNotSame(studentobj.get("b") ,obj.returnStudentObj(studentobj,"a"));

        assertEquals(studentobj.get(null) ,obj.returnStudentObj(studentobj,null));
        assertEquals(studentobj.get(" ") ,obj.returnStudentObj(studentobj," "));

    }
}