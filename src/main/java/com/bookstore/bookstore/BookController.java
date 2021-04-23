package com.bookstore.bookstore;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/addBook", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @PostMapping(value = "/getBookPrice", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getBookPrice(@RequestBody BookPromo bookPromo){
        return bookService.checkOut(bookPromo.getBookNames(), bookPromo.getPromoCode());
    }

}
