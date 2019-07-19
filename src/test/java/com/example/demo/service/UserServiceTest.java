package com.example.demo.service;

import com.example.demo.model.User;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {

    public static final User FRODO = new User("Frodo", 40);
    public static final User BILBO = new User("Bilbo", 111);

    @Autowired
    UserService service;

    @Test
    void loadContext() {
        assertThat(service).isNotNull();
    }

    @Test
    void saveRequired() {
        val frodo = service.saveRequired(FRODO);
        System.out.println(frodo);

        val bilbo = service.saveRequired(BILBO);
        System.out.println(bilbo);
    }

    @Test
    void getRequiredNew() {

    }
}