package arraylist;

import java.util.ArrayList;

public class RemoveStudentsBelowAverage {
    public void removeBelowAverageGPA(ArrayList<Student> studentList) {
        // Calculate average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        double averageGPA = studentList.isEmpty() ? 0 : totalGPA / studentList.size();

        // Remove students with GPA below average
        studentList.removeIf(student -> student.gpa < averageGPA);
    }
    public static void main(String[] args) {
        // Example usage
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Crew", 3.4));
        students.add(new Student("Jenny", "Smith", 3.2));
        students.add(new Student("Jessie", "Johnson", 3.7));

        arraylist.RemoveStudentsBelowAverage remover = new arraylist.RemoveStudentsBelowAverage();

        System.out.println("Before removal:");
        printStudents(students);

        remover.removeBelowAverageGPA(students);

        System.out.println("\nAfter removal:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.gpa);
        }
    }
}