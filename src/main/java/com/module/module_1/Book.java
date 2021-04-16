package com.module.module_1;
import com.sun.istack.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")

public class Book {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min = 3, max = 50)
    @Column(name = "book_title")
    private String bookTitle;
    @Min(value = 1900)
    @Max(value = 2018)
    @Column(name = "book_year")
    private int bookYear;
    @Min(value = 0)
    @Max(value = 100000)
    @Column(name = "book_price")
    private float bookPrice;

    @ManyToMany(mappedBy = "authors")
    Set<Author> books;


    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public int getBookYear(){
        return bookYear;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public Book(String bookTitle, int bookYear, float bookPrice) {
        this.bookTitle = bookTitle;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
    }

    public Book() {

    }

}