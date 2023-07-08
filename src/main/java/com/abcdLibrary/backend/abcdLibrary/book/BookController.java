package com.abcdLibrary.backend.abcdLibrary.book;


import com.abcdLibrary.backend.abcdLibrary.book.dto.BookCreateForm;
import com.abcdLibrary.backend.abcdLibrary.book.dto.BookInfo;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponse;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponse;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponseFactory;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/book")
public class BookController {

    private final BookService bookService;
    private final RestResponseFactory resp;


    @GetMapping({"", "/", "/all", "/all/"})
    public ResponseEntity<RestResponse<List<BookInfo>>> getAllBook() {

        var bookList = bookService.getAllBook();

        return ResponseEntity.ok(resp.success("booksFetched", bookList));
    }

    @PostMapping("/save")
    public ResponseEntity<BookInfo> saveBook(@RequestBody @Valid BookCreateForm bookCreateForm) {
        return new ResponseEntity<>(bookService.saveBook(bookCreateForm), HttpStatus.CREATED);
    }


}


