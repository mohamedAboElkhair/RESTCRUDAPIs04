package org.itwco.restcrudapis04.restController;

import jakarta.annotation.PostConstruct;
import org.itwco.restcrudapis04.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> theStudents;

    @PostConstruct
    public void dataLode() {
       theStudents = new ArrayList<>();
        theStudents.add(new Student("mohamed","abouelkhair"));
        theStudents.add(new Student("hamed", "mohamed"));
    }



    @GetMapping("/students")
    public List<Student> getStudent() {
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if ((studentId >= theStudents.size()) || (studentId < 0)) {
           throw  new NotFoundException("Student not found "+studentId);
        }
     return theStudents.get(studentId);
    };
    // add exception handler using @ExpectionHandler


}
