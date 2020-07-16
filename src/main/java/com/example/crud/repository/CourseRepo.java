package com.example.crud.repository;

import com.example.crud.model.Course;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface CourseRepo extends MongoRepository<Course,String> {
    List<Course> findByStudentId(String studentId);

}
