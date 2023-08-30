package com.example.bluecodingexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest implements Serializable {
    private String name;
    private String email;
    private Integer age;
}
