package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DvdDataPojo {
    private Integer id;
    private Integer uuid;
    private String dvdName;
    private String directorSurname;
    private String directorName;
    private String year;
    private String duration;
    private String genres;
    private String language;


    public DvdDataPojo() {
    }


    public DvdDataPojo(Integer id, Integer uuid, String dvdName, String directorSurname, String directorName, String year, String duration, String genres, String language) {
        super();
        this.id = id;
        this.uuid = uuid;
        this.dvdName = dvdName;
        this.directorSurname = directorSurname;
        this.directorName = directorName;
        this.year = year;
        this.duration = duration;
        this.genres = genres;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getDirectorSurname() {
        return directorSurname;
    }

    public void setDirectorSurname(String directorSurname) {
        this.directorSurname = directorSurname;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "DvdPojo{" +
                "id=" + id +
                ", uuid=" + uuid +
                ", dvdName='" + dvdName + '\'' +
                ", directorSurname='" + directorSurname + '\'' +
                ", directorName='" + directorName + '\'' +
                ", year='" + year + '\'' +
                ", duration='" + duration + '\'' +
                ", genres='" + genres + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
