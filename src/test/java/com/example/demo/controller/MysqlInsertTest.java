package com.example.demo.controller;


import com.example.demo.DemoApplication;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MysqlInsertTest {

    @Autowired
    private UserRepository repository;

    private User user;

    @Before
    public void setUp() {

        user = User.builder()
                .name("cheoljin")
                .age(29)
                .email("asddqe111@gmail.com")
                .build();

    }

    @Test
    public void MySQL_INSERT_TEST() {

        repository.save(user);
    }
}
