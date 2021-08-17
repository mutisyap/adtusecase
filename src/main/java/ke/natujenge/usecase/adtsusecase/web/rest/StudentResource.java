package ke.natujenge.usecase.adtsusecase.web.rest;

import ke.natujenge.usecase.adtsusecase.domain.Question;
import ke.natujenge.usecase.adtsusecase.domain.Student;
import ke.natujenge.usecase.adtsusecase.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class StudentResource {
    private final StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/api/students")
    public void addStudent(@RequestBody Student student){
        this.studentService.save(student);
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @PostMapping("/api/questions")
    public void askQuestion(@RequestBody Question question){
    }
}
