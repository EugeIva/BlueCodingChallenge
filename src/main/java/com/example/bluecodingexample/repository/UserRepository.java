package com.example.bluecodingexample.repository;

import com.example.bluecodingexample.model.ExampleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<ExampleUser, UUID> {
}
