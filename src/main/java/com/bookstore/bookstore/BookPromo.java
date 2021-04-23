package com.bookstore.bookstore;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class BookPromo {
    private List<String> bookNames;
    private String promoCode;

    public List<String> getBookNames() {
        return bookNames;
    }

    public void setBookNames(List<String> bookNames) {
        this.bookNames = bookNames;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
}
