package com.example.springboottesting.repository;

import com.example.springboottesting.entity.TestUser;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class TestUserRepositoryTest {

  @Autowired
  private TestUserRepository testUserRepository;

  @Test
  public void testUserSave(){

    TestUser user = TestUser.builder()
      .name("habib")
      .address("Bashundhara")
      .email("abc@gmail.com")
      .number("24234234")
      .build();

    TestUser testUser = testUserRepository.save(user);

    Assertions.assertThat(testUser).isNotNull();
    Assertions.assertThat(testUser.getId()).isGreaterThan(0);

  }

}
