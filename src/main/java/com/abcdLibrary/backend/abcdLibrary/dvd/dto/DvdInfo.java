package com.abcdLibrary.backend.abcdLibrary.dvd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DvdInfo {

    private int id;

    private int uuid;

    private String dvdName;

    private String directorSurname;

    private String directorName;

    private String year;

    private String duration;

    private String genres;

    private String language;
}
