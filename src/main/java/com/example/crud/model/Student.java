package com.example.crud.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document(collection = "student")
public class Student {
    @Id
    private String id;

    @NotNull(message = "firstName shd not be null")
@NotBlank
    private String firstName;
    private String lastName;
    private Date birthDay;
    private List<String> courses= new ArrayList<>();


    public Student(String id, @NotNull(message = "firstName shd not be null") String firstName, String lastName, Date birthDay, List<String> course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.courses = course;
    }
    public Student() {

    }
}


