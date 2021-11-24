package com.abcdLibrary.backend.abcdLibrary.book;

import com.abcdLibrary.backend.abcdLibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, Integer> {

    List<Book> findAllById(Long id);
    List<Book> findAllByBookNameContains(@NonNull String name);

    @NonNull
    Optional<Book> findByUuid(@NonNull UUID bookUuid);

}
