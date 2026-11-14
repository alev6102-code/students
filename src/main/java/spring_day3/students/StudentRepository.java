package spring_day3.students;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository {
    private final List<Student> students=new ArrayList<>();
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public Student getStudentById(int id) {
        return students.get(id);
    }

}
