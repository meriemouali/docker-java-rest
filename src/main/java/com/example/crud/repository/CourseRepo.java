package com.example.crud.repository;

import com.example.crud.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepo extends MongoRepository<Course,String> {
}
