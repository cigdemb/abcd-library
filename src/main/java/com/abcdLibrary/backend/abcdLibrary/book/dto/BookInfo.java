package com.abcdLibrary.backend.abcdLibrary.book.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookInfo {


    private Long id;

    private int uuid;

    private String bookName;

    private String authorSurname;

    private String authorName;

    private String edition;

    private Integer pageNumber;

    private String language;
}
