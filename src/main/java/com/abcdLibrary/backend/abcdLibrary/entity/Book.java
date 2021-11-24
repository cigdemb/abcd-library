package com.abcdLibrary.backend.abcdLibrary.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "book")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Book {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "uuid", nullable = false)
    private UUID uuid;

    @Column(length = 100, nullable = false)
    private String bookName;

    @Column(length = 25, nullable = false)
    private String authorSurname;

    @Column(length = 25, nullable = false)
    private String authorName;

    @Column(length = 25, nullable = false)
    private String edition;

    @Column(length = 25, nullable = false)
    private Integer pageNumber;

    @Column(length = 25, nullable = false)
    private String language;

}
