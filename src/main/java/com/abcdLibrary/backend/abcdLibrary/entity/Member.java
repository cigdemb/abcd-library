package com.abcdLibrary.backend.abcdLibrary.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "member")
@RequiredArgsConstructor
@ToString()
@EqualsAndHashCode()
public class Member {


    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "uuid", nullable = false)
    private UUID uuid;

    @Column(length = 25, nullable = false)
    private String username;


    @Column(length = 25, nullable = false)
    private String name;

    @Column(length = 25, nullable = false)
    private String surname;

    @Column(length = 25, nullable = false)
    private String cardRegistrationNumber;

    @Column(length = 120, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String address1;

    @Column(length = 50, nullable = false)
    private String address2;

    @Column(length = 25, nullable = false)
    private String phone;


}
