package com.example.crud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {
    private Boolean success;
    private Object data;
    private String error;
    private String message;


    public ResponseDto(Boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public ResponseDto(Boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
