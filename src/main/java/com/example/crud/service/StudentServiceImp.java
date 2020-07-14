package com.example.crud.service;

import com.example.crud.model.Student;
import com.example.crud.repository.StudentimpDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    private StudentimpDao studentRepo;

    public StudentServiceImp(StudentimpDao studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Override
    public Student createStudent(Student student){
         return  studentRepo.save(student);
    }
    @Override
    public List<Student> getStudents(){
        return studentRepo.findAll();

    }
    @Override
    public Optional<Student> getStudentById(String id){
        return  studentRepo.findById(id);
    }

    @Override
    public Optional<Student> getStudentByFirstName(String name) {
        Optional<Student> student = studentRepo.findByFirstName(name);
        return student;
    }
    @Override
    public Student updateStudent(Student student){
          studentRepo.save(student);
        return student;
    }
    @Override
    public void deleteStudent(String id){
        studentRepo.deleteById(id);
    }

}
