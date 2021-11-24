package com.abcdLibrary.backend.abcdLibrary.dvd.dto;

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
public class DvdCreateForm {

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
