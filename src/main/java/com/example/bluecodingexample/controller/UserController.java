package com.example.bluecodingexample.controller;

import com.example.bluecodingexample.dto.UserRequest;
import com.example.bluecodingexample.model.ExampleUser;
import com.example.bluecodingexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;


    @PostMapping
    public ResponseEntity<UUID> createUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.createUser(userRequest), HttpStatus.valueOf(201));
    }

    @GetMapping
    public ResponseEntity<ExampleUser> getUser(@RequestParam UUID id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ExampleUser> updateUser(@RequestBody ExampleUser user) {
        return new ResponseEntity<>(userService.update(user),HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestParam UUID id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.valueOf(204));
    }
}
