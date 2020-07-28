package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStudent {
    private String id;
    @NotBlank
    @NotNull
    private String firstName;
    private String lastName;
    private Date birthDay;
    @NotNull
    @UniqueElements
    private List<String> course;

}
