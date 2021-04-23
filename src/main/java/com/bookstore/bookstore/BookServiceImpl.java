package com.bookstore.bookstore;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Override
    public String addBook(Book book) {
        bookRepository.save(book);
        return "SUCESS";
    }

    @Override
    public String checkOut(List<String> bookNames, String promoCode) {
        List<Book> books = bookRepository.getBookByNames(bookNames);
        if(books == null)return null;
        return books.stream().map(book -> applyPromo(book.getPrice(), promoCode)).reduce(0.0, (x,y)-> x+y).toString();

    }

    private Double applyPromo(String price, String promoCode) {
        if(promoCode == null) return Double.valueOf(price);
        Integer disc = BookDiscount.getDiscountMap().get(promoCode) == null ? 0 : BookDiscount.getDiscountMap().get(promoCode);
        return Double.valueOf(price) - ((Double.valueOf(price) * disc) / 100);
    }
}
