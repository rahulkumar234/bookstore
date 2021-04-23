package com.bookstore.bookstore;

import java.math.BigDecimal;
import java.util.List;

public interface BookService {
    String addBook(Book book);

    String checkOut(List<String> bookNames, String promoCode);
}
