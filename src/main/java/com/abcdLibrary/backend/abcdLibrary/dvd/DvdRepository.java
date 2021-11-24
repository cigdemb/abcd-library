package com.abcdLibrary.backend.abcdLibrary.dvd;

import com.abcdLibrary.backend.abcdLibrary.entity.Book;
import com.abcdLibrary.backend.abcdLibrary.entity.Dvd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DvdRepository extends CrudRepository<Dvd, Integer> {


    List<Dvd> findAllById(Long id);
    List<Dvd> findAllByDvdNameContains(@NonNull String name);

    @NonNull
    Optional<Dvd> findByUuid(@NonNull UUID dvdUuid);
}
