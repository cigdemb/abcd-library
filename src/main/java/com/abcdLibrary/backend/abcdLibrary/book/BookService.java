package com.abcdLibrary.backend.abcdLibrary.book;

import com.abcdLibrary.backend.abcdLibrary.book.dto.BookCreateForm;
import com.abcdLibrary.backend.abcdLibrary.book.dto.BookInfo;
import com.abcdLibrary.backend.abcdLibrary.book.dto.BookMapper;
import com.abcdLibrary.backend.abcdLibrary.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;



    public List<BookInfo> getAllBook() {
        List<BookInfo> result = new ArrayList<>();

        bookRepository.findAll().forEach(t -> {
            BookInfo target = new BookInfo();

            BeanUtils.copyProperties(t, target);
            result.add(target);
        });

        return result;


    }

    public BookInfo saveBook(BookCreateForm bookCreateForm) {
        Book book = bookMapper.mapBookCreateFormToBook(bookCreateForm);
        UUID uuid = new UUID(8, 4);
        book.setUuid(uuid);
        Book savedBook =  bookRepository.save(book);

        return bookMapper.mapBookToBookInfo(savedBook);
    }
}


//    public List<BookInfo> listAllBookInfo() {
//
//
//            return List.of (
//                    new BookInfo(
//                            1,
//                            1001,
//                            "Tutunamayanlar",
//                            "Atay",
//                            "Oguz",
//                            "1. edition",
//                            671,
//                            "Turkish"
//
//                    )
//            );
//    }