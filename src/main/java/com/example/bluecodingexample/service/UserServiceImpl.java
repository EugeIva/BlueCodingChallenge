package com.example.bluecodingexample.service;

import com.example.bluecodingexample.dto.UserRequest;
import com.example.bluecodingexample.model.ExampleUser;
import com.example.bluecodingexample.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @PostConstruct
    void init () {
        ExampleUser exampleUser = new ExampleUser();
//        UUID uuid = UUID.fromString("bec482fa-b983-468a-8c5a-b1cbb18d0c2d");
        UUID uuid = UUID.fromString("2f54bc9e-476c-11ee-be56-0242ac120002");
        exampleUser.setUuid(uuid);
        exampleUser.setName("test");
        exampleUser.setEmail("test");
        userRepository.save(exampleUser);
    }

    @Override
    public UUID createUser(UserRequest userRequest) {
        ExampleUser exampleUser = new ExampleUser(userRequest);
        return userRepository.save(exampleUser).getUuid();
    }

    @Override
    public ExampleUser getUser(UUID id) {
        return userRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("user not found"));
    }

    @Override
    public ExampleUser update(ExampleUser user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}
