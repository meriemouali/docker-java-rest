package com.example.crud.service;

import com.example.crud.dto.ResponseDto;
import com.example.crud.dto.ResponseStudent;

import java.util.List;


public interface StudentService {

    ResponseDto createStudent(ResponseStudent studentResponse);

    ResponseDto getStudents();

    ResponseDto getStudentById(String id);


    ResponseDto updateStudent(ResponseStudent student);

    ResponseDto deleteStudent(String id);

}
