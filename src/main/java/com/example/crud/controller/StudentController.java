package com.example.crud.controller;

import com.example.crud.dto.ResponseStudent;
import com.example.crud.service.StudentServiceImp;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    public StudentController(StudentServiceImp service) {
        this.service = service;
    }

    private StudentServiceImp service;

    @PostMapping("/")

    public ResponseStudent insertStudent(@RequestBody @Valid ResponseStudent studentCourse) {

        return service.createStudent(studentCourse);

    }

    @GetMapping("/")
    public List<ResponseStudent> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/{id}")
    public ResponseStudent getStudentById(@PathVariable("id") String id) {
        return service.getStudentById(id);
    }

    @PutMapping("/")
    public ResponseStudent updateStudent(@RequestBody ResponseStudent student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id) {
        service.deleteStudent(id);
    }


}
