// StudentController.java

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public StudentController() {
        studentService = new StudentService();
    }

    // Create a new student
    public void createStudent(int id, String name, String email) {
        Student student = new Student(id, name, email);
        studentService.addStudent(student);
        System.out.println("Student added: " + student);
    }

    // Retrieve all students
    public void listAllStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Update student details
    public void updateStudent(int id, String name, String email) {
        Student updatedStudent = new Student(id, name, email);
        studentService.updateStudent(id, updatedStudent);
        System.out.println("Student updated: " + updatedStudent);
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
        System.out.println("Student with ID " + id + " has been deleted.");
    }

    // Find a student by ID
    public void findStudentById(int id) {
        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
