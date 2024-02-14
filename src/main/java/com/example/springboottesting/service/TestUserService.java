package com.example.springboottesting.service;

import com.example.springboottesting.dto.TestUserDto;
import com.example.springboottesting.entity.TestUser;
import com.example.springboottesting.repository.TestUserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestUserService {

  private final TestUserRepository testUserRepository;

  public TestUser saveUser(TestUserDto testUserDto){
    TestUser testUser = TestUser.builder()
      .name(testUserDto.name())
      .address(testUserDto.address())
      .email(testUserDto.email())
      .number(testUserDto.number())
      .build();
    return testUserRepository.save(testUser);
  }
}
