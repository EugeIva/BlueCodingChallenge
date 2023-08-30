package com.example.bluecodingexample.model;

import com.example.bluecodingexample.dto.UserRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ExampleUser {

    @Id
    private UUID uuid;
    private String name;
    private String email;
    private Integer age;

    public ExampleUser(UserRequest userRequest) {
        this.age = userRequest.getAge();
        this.email = userRequest.getEmail();
        this.name = userRequest.getName();
        this.uuid = UUID.randomUUID();
    }
}
