package com.example.crud.service;

import com.example.crud.dto.ResponseStudent;

import java.util.List;


public interface StudentService {

    ResponseStudent createStudent(ResponseStudent studentResponse);

    List<ResponseStudent> getStudents();

    ResponseStudent getStudentById(String id);


    ResponseStudent updateStudent(ResponseStudent student);

    void deleteStudent(String id);


}
