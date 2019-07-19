package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class User {

    @Id
    @Column(name = "name")
    private final String name;

    @Column(name = "age")
    private final Integer age;

    public User() {
        this.name = "R";
        this.age = 3;
    }
}
