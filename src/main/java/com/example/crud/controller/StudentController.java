package com.example.crud.controller;

import com.example.crud.dto.ResponseDto;
import com.example.crud.dto.ResponseStudent;
import com.example.crud.service.StudentServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResponseDto> insertStudent(@RequestBody @Valid ResponseStudent studentCourse) {
        return new ResponseEntity<>(service.createStudent(studentCourse), HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<ResponseDto> updateStudent(@RequestBody ResponseStudent student) {
        return new ResponseEntity<>(service.updateStudent(student), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<ResponseDto> getStudents() {
        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getStudentById(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getStudentById(id),HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> deleteStudent(@PathVariable("id") String id) {
        return  new ResponseEntity<>(service.deleteStudent(id),HttpStatus.OK);
    }


}
