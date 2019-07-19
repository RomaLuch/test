package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserDao;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import static org.springframework.transaction.annotation.Propagation.*;

@Service
@Data
@RequiredArgsConstructor
public class UserService {

    private final UserDao repository;

    @Transactional()
    public User saveRequired(User user) {
        User result = repository.save(user);
        User dbTestUser = getRequiredNew(user.getName());
        System.out.println(dbTestUser + " from repo saveRequired");
        return result;
    }

    @Transactional(propagation = REQUIRES_NEW)
    public User getRequiredNew(String name) {
        User user = repository.findByName(name);
        System.out.println(user + " from repo (getRequiredNew)");
        return user;
    }
}
