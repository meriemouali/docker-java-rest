package com.example.crud.service;

import com.example.crud.model.Student;
import com.example.crud.repository.StudentimpDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentimpDao studentRepo;

    public StudentService(StudentimpDao studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student createStudent(Student student){
         return  studentRepo.save(student);
    }
    public List<Student> getStudents(){
        return studentRepo.findAll();

    }
    public Optional<Student> getStudentById(String id){
        return  studentRepo.findById(id);
    }
    public Student updateStudent(String id,Student student){
        return  studentRepo.save(student);
    }
    public void deleteStudent(String id){
        studentRepo.deleteById(id);
    }

}
