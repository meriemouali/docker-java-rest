package com.example.crud.repository;

import com.example.crud.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentimpDao extends MongoRepository<Student,String> {
 Optional<Student> findByFirstName(String name);
}
