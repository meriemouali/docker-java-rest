package com.example.crud.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Getter
@Setter

@Document(collection = "course")
public class Course {
    @Id
    private String id;
    private String StudentId;
    @NotNull
    @NotEmpty
    @NotBlank
    private String title;


    public Course(String id, String studentId, @NotNull @NotEmpty @NotBlank String title) {
        this.id = id;
        StudentId = studentId;
        this.title = title;
    }
}
