package com.example.crud.controller;

import com.example.crud.model.Student;
import com.example.crud.service.StudentServiceImp;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    public StudentController(StudentServiceImp service) {
        this.service = service;
    }

    private StudentServiceImp service;

    @PostMapping("/")

    public Student insertStudent(@RequestBody @Valid Student student) {
        return service.createStudent(student);

    }

    @GetMapping("/")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String id) {
        return service.getStudentById(id);
    }

    @PutMapping("/")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id) {
        service.deleteStudent(id);
    }


}
