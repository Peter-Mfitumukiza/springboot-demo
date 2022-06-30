package com.cgroup.smis.service;

import com.cgroup.smis.model.Student;
import com.cgroup.smis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> studentList(){
        return studentRepository.findAll();
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long studentId){
        return studentRepository.findById(studentId);
    }
}
