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

    Optional<Student> getStudentById(String id);

    Optional<Student> getStudentByFirstName(String name);

    Student updateStudent(Student student);

    void deleteStudent(String id);


}
