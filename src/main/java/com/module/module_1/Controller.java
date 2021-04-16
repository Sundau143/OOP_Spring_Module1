package com.module.module_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
        }

     @PostMapping("/addAuthor")
     public void addAuthor(@RequestBody Author author) {
        service.addAuthor(author);
     }

    @GetMapping("/getBooks")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @PutMapping("/changeBookById")
    public void changeBookById(@RequestBody Book book, int id){
        service.changeBookById(book, id);
    }

    @DeleteMapping("/deleteBookByIdAndYears")
    public void deleteBookByIdAndYears(@RequestBody int firstYear, int secondYear, int id) {
        service.deleteBookByIdAndYears(firstYear, secondYear, id);
    }

    @DeleteMapping("/deleteAuthorById")
    public void deleteAuthorById(int id) {
        service.deleteAuthorById(id);
    }

    @GetMapping("/getBooksByAuthor")
    public List<Book> getAllBooksByAuthor(@RequestBody String lastName){
        return service.getAllBooksByAuthor(lastName);
    }

    @GetMapping("/getBooksInYears")
    public List<Book> getAllBooksInYears(@RequestBody int firstYear, int secondYear) {
        return service.getAllBooksInYears(firstYear, secondYear);
    }

}
