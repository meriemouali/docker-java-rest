package com.example.crud.service;

import com.example.crud.dto.ResponseStudent;
import com.example.crud.model.Course;
import com.example.crud.model.Student;
import com.example.crud.repository.StudentimpDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    ResponseStudent createStudent(ResponseStudent studentResponse);

    List<Student> getStudents();

    ResponseStudent getStudentById(String id);

    Optional<Student> getStudentByFirstName(String name);

    ResponseStudent updateStudent(ResponseStudent student);

    void deleteStudent(String id);


}
