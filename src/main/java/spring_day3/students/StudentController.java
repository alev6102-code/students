package spring_day3.students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentResponse> getStudents(@RequestParam(required = false) Group group) {
       return studentService.getStudents(group);
    }
    @GetMapping("/{id}")
    public StudentResponse getStudentById(@PathVariable int id) {
        return studentService.getStudentsByName(id);
    }
    @PostMapping
    public StudentResponse addStudent(@RequestBody CreateStudent student) {
       return studentService.addStudent(student);
    }
}
