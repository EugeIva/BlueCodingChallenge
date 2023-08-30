package com.example.bluecodingexample.service;

import com.example.bluecodingexample.dto.UserRequest;
import com.example.bluecodingexample.model.ExampleUser;

import java.util.UUID;

public interface UserService {
    UUID createUser(UserRequest userRequest);

    ExampleUser getUser(UUID id);

    ExampleUser update(ExampleUser user);

    void delete(UUID id);
}
