package com.abcdLibrary.backend.abcdLibrary.book.dto;

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
public class BookCreateForm {

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
