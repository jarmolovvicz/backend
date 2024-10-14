package com.example.lab.user;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "contact_number")
    @Nullable
    private String contactNumber;

    public User(String name, String surname, String email, @Nullable String contactNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contactNumber = contactNumber;
    }

}
