// StudentService.java

import java.util.ArrayList;
import java.util.List;

public class servicelayers {
    private List<Student> students;

    public servicelayers() {
        this.students = new ArrayList<>();
    }

    // Create Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Read All Students
    public List<Student> getAllStudents() {
        return students;
    }

    // Update Student
    public void updateStudent(int id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setEmail(updatedStudent.getEmail());
            }
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // Find Student by ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
