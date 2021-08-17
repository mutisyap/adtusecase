package ke.natujenge.usecase.adtsusecase.service;

import ke.natujenge.usecase.adtsusecase.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final Logger logger = LoggerFactory.getLogger(StudentService.class);

    private Map<String, Student> studentsKeyedByEmail = new LinkedHashMap<>();

    public void save(Student student){
        student.setCreatedOn(System.currentTimeMillis());
        studentsKeyedByEmail.put(student.getEmail(), student);
        logger.info("Successfully added student to map. Email : {}, student : {}", student.getEmail(), student);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        for (Map.Entry<String, Student> entry : studentsKeyedByEmail.entrySet()){
            students.add(entry.getValue());
        }

        return students;
    }
}
