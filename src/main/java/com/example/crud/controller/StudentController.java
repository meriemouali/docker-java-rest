package com.example.crud.controller;

import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    public StudentController(StudentService service) {
        this.service = service;
    }

    private  StudentService service;
    @PostMapping("/")
    public Student insertStudent(@RequestBody Student student){
       return service.createStudent(student);

    }
    @GetMapping("/")
    public List<Student> getStudents(){
        return  service.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable("id")  String  id){
        return service.getStudentById(id);
    }
    @PutMapping("/{id}")
    public Student updateStudent( @PathVariable("id") String  id, Student student){
        return  service.updateStudent(id,student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id){
        service.deleteStudent(id);
    }



}
