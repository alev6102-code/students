package spring_day3.students;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private int id=0;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<StudentResponse> getStudents(Group group) {
        return studentRepository.getStudents().stream().filter(student -> group==null || group==student.getGroup()).
                map(student -> new StudentResponse(student.getId(),student.getName(),student.getGroup())).toList();
    }
    public StudentResponse getStudentsByName( int id) {
        Student student=studentRepository.getStudentById(id);
        return new StudentResponse(student.getId(),student.getName(),student.getGroup());
    }
   public StudentResponse addStudent(CreateStudent student) {
        id++;
        studentRepository.addStudent(new Student(id,student.getName(),student.getGroup()));
        return new StudentResponse(id, student.getName(), student.getGroup());
   }
}
