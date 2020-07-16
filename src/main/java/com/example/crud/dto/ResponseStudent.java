package com.example.crud.dto;

import com.example.crud.model.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStudent {
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private List<Course> course;

}
