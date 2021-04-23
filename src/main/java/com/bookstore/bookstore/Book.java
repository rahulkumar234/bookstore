package com.bookstore.bookstore;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="bookstore")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;
    @Column(name = "author")
    String author;
    @Column(name = "type")
    BookTypeEnum type;
    @Column(name = "price")
    String price;
    @Column(name = "isbn")
    String isbn;
    @Column(name = "promocode")
    String promoCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookTypeEnum getType() {
        return type;
    }

    public void setType(BookTypeEnum type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
}
