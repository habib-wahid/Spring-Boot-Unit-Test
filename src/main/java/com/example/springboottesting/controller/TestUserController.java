package com.example.springboottesting.controller;

import com.example.springboottesting.dto.TestUserDto;
import com.example.springboottesting.entity.TestUser;
import com.example.springboottesting.service.TestUserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class TestUserController {

  private final TestUserService testUserService;

  @PostMapping
  public TestUser saveUser(@RequestBody TestUserDto testUserDto){
    return testUserService.saveUser(testUserDto);
  }
}
