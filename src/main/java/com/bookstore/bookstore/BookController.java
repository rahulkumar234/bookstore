package com.bookstore.bookstore;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @PostMapping(value = "/addBook", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String addBook(Book book){
        return bookService.addBook(book);
    }
    @PostMapping(value = "/getBookPrice", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getBookPrice(BookPromo bookPromo){
        return bookService.checkOut(bookPromo.getBookNames(), bookPromo.getPromoCode());
    }

}
