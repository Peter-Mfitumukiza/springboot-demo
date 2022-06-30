package com.cgroup.smis.controller;

import com.cgroup.smis.model.Student;
import com.cgroup.smis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:8080")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/app/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getStudents(){
        return studentService.studentList();
    }
    @PostMapping("app/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/students/{studentid}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Student> getStudentById(@PathVariable(value="studentid") Integer id) {
            return studentService.getStudentById(Long.valueOf(id));
    }
}
