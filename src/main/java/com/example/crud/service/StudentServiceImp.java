package com.example.crud.service;

import com.example.crud.dto.ResponseDto;
import com.example.crud.dto.ResponseStudent;
import com.example.crud.model.Student;
import com.example.crud.repository.StudentimpDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {
    private final StudentimpDao studentRepo;


    public StudentServiceImp(StudentimpDao studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public ResponseDto createStudent(ResponseStudent studentCourse) {
        Student body = new Student();
        body.setId(studentCourse.getId());
        body.setFirstName(studentCourse.getFirstName());
        body.setLastName(studentCourse.getLastName());
        body.setBirthDay(studentCourse.getBirthDay());
        body.setCourses(studentCourse.getCourse());
        Student s = studentRepo.save(body);

        ResponseStudent res = new ResponseStudent();
        res.setCourse(s.getCourses());
        res.setId(s.getId());
        res.setFirstName(s.getFirstName());
        res.setLastName(s.getLastName());
        res.setBirthDay(s.getBirthDay());
        return new ResponseDto(true, res, "Student created successfully");

    }

    @Override
    public ResponseDto getStudents() {
        return new ResponseDto(true, studentRepo.findAll().stream().map((item) -> {
            ResponseStudent resp = new ResponseStudent();
            resp.setId(item.getId());
            resp.setFirstName(item.getFirstName());
            resp.setLastName(item.getLastName());
            resp.setBirthDay(item.getBirthDay());
            resp.setCourse(item.getCourses());
            return resp;
        }).collect(Collectors.toList()), "list of students");
    }

    @Override
    public ResponseDto getStudentById(String id) {
        Optional<Student> s = studentRepo.findById(id);
        ResponseStudent res = new ResponseStudent();
        res.setCourse(s.get().getCourses());
        res.setId(s.get().getId());
        res.setFirstName(s.get().getFirstName());
        res.setLastName(s.get().getLastName());
        res.setBirthDay(s.get().getBirthDay());
        return new ResponseDto(true, res, "student By Id");

    }


    @Override
    public ResponseDto updateStudent(ResponseStudent student) {

        Optional<Student> s = studentRepo.findById(student.getId());
        s.get().setFirstName(student.getFirstName());
        s.get().setLastName(student.getLastName());
        s.get().setBirthDay(student.getBirthDay());
        s.get().setCourses(student.getCourse());
        studentRepo.save(s.get());


        return new ResponseDto(true, student, "student updated successufully");
    }

    @Override
    public ResponseDto deleteStudent(String id) {
        studentRepo.deleteById(id);
        return new ResponseDto(true, "failed to delete");
    }

}
