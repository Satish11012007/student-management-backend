package com.collageIntern.FirstProject.Controller;

import com.collageIntern.FirstProject.Entity.Student;
import com.collageIntern.FirstProject.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/students")
public class StudentController {


        private final StudentService service;

        public StudentController(StudentService service) {
            this.service = service;
        }

        @PostMapping
        public Student createStudent(@RequestBody Student student) {
            return service.saveStudent(student);
        }

        @GetMapping
        public List<Student> getStudents() {
            return service.getAllStudents();
        }
}
