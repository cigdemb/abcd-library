package com.abcdLibrary.backend.abcdLibrary.book;

import com.abcdLibrary.backend.abcdLibrary.book.dto.BookInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class BookService {

    private final BookRepository bookRepository;



    public List<BookInfo> getAllBook() {
        List<BookInfo> result = new ArrayList<>();

        bookRepository.findAll().forEach(t -> {
            BookInfo target = new BookInfo();

            BeanUtils.copyProperties(t, target);
            result.add(target);
        });

        return result;


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