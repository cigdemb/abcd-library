package com.abcdLibrary.backend.abcdLibrary.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "dvd")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Dvd {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "uuid", nullable = false)
    private UUID uuid;

    @Column(length = 100, nullable = false)
    private String dvdName;

    @Column(length = 25, nullable = false)
    private String directorSurname;

    @Column(length = 25, nullable = false)
    private String directorName;

    @Column(length = 25, nullable = false)
    private String year;

    @Column(length = 25, nullable = false)
    private String duration;

    @Column(length = 25, nullable = false)
    private String language;

    @Column(length = 25, nullable = false)
    private String genres;

}
