package com.example.crud.repository;

import com.example.crud.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentimpDao extends MongoRepository<Student,String> {

}
