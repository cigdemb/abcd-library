package com.abcdLibrary.backend.abcdLibrary.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberCreateForm {

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
