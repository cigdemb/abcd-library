package com.abcdLibrary.backend.abcdLibrary.book.dto;

import com.abcdLibrary.backend.abcdLibrary.entity.Book;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BookMapper {

    public Book mapBookCreateFormToBook(BookCreateForm bookCreateForm) {
        Book book = new Book();
        book.setBookName(bookCreateForm.getBookName());
        book.setAuthorName(bookCreateForm.getAuthorName());
        book.setAuthorSurname(bookCreateForm.getAuthorSurname());
        book.setEdition(bookCreateForm.getEdition());
        book.setPageNumber(bookCreateForm.getPageNumber());
        book.setLanguage(bookCreateForm.getLanguage());
        return book;
    }

    public BookInfo mapBookToBookInfo(Book book) {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setId(book.getId());
        bookInfo.setUuid(bookInfo.getUuid());
        bookInfo.setBookName(book.getBookName());
        bookInfo.setAuthorName(book.getAuthorName());
        bookInfo.setAuthorSurname(book.getAuthorSurname());
        bookInfo.setEdition(book.getEdition());
        bookInfo.setLanguage(book.getLanguage());
        bookInfo.setPageNumber(book.getPageNumber());
        bookInfo.setLanguage(book.getLanguage());
        return bookInfo;
    }
}
