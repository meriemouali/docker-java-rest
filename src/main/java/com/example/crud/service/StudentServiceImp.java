package com.example.crud.service;

import com.example.crud.dto.ResponseStudent;
import com.example.crud.model.Course;
import com.example.crud.model.Student;
import com.example.crud.repository.CourseRepo;
import com.example.crud.repository.StudentimpDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {
    private StudentimpDao studentRepo;
    private CourseRepo courseRepo;


    public StudentServiceImp(StudentimpDao studentRepo, CourseRepo courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    @Override
    public ResponseStudent createStudent(ResponseStudent studentCourse) {
        Student body = new Student();
        body.setId(studentCourse.getId());
        body.setFirstName(studentCourse.getFirstName());
        body.setLastName(studentCourse.getLastName());
        body.setBirthDay(studentCourse.getBirthDay());
        Student s = studentRepo.save(body);
        studentCourse.getCourse().stream().map((item) -> {
            item.setStudentId(s.getId());
            return null;
        }).collect(Collectors.toList());
        List<Course> c = courseRepo.saveAll(studentCourse.getCourse());
        ResponseStudent res = new ResponseStudent();
        res.setCourse((List<Course>) c);
        res.setId(s.getId());
        res.setFirstName(s.getFirstName());
        res.setLastName(s.getLastName());
        res.setBirthDay(s.getBirthDay());
        return res;

    }

    @Override
    public List<Student> getStudents() {
        return studentRepo.findAll();

    }

    @Override
    public ResponseStudent getStudentById(String id) {
        Optional<Student> s = studentRepo.findById(id);
        List<Course> c = courseRepo.findByStudentId(s.get().getId());
        ResponseStudent res = new ResponseStudent();
        res.setCourse(c);
        res.setId(s.get().getId());
        res.setFirstName(s.get().getFirstName());
        res.setLastName(s.get().getLastName());
        res.setBirthDay(s.get().getBirthDay());
        return res;

    }

    @Override
    public Optional<Student> getStudentByFirstName(String name) {
        Optional<Student> student = studentRepo.findByFirstName(name);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @Override
    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }

}
