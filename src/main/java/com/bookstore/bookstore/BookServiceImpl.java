package com.bookstore.bookstore;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public String addBook(Book book) {
        bookRepository.save(book);
        return "SUCESS";
    }

    @Override
    public String checkOut(List<String> bookNames, String promoCode) {
        List<Book> books = bookRepository.getBookByNameIn(bookNames);
        if(books == null)return null;
        return books.stream().map(book -> applyPromo(book, promoCode)).reduce(0.0, (x,y)-> x+y).toString();

    }

    private Double applyPromo(Book book, String promoCode) {
        if(promoCode == null || !promoCode.equalsIgnoreCase(book.getPromoCode())) return Double.valueOf(book.getPrice());
        Integer disc = BookDiscount.getDiscountMap().get(promoCode) == null ? 0 : BookDiscount.getDiscountMap().get(promoCode);
        return Double.valueOf(book.getPrice()) - ((Double.valueOf(book.getPrice()) * disc) / 100);
    }
}
