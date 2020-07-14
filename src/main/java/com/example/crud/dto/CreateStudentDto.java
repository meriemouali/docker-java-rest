package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentDto implements Serializable {

    @NotEmpty(message = "firstName shd not be empty")
    @NotNull(message = "firstName shd not be empty")
    @NotBlank(message = "firstName shd not be empty")
    private String firstName;

    @NotNull
    private String lastName;

}
