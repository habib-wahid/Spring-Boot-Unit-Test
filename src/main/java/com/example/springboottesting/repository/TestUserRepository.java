package com.example.springboottesting.repository;

import com.example.springboottesting.entity.TestUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {
}
