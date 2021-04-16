package com.module.module_1;
import com.module.module_1.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service

public class Service {

    @Autowired
    private AuthorRepository authorRepo;
    @Autowired
    private BookRepository bookRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void changeBookById(Book book, int id){
       // удаление книги по id
    }

    public void deleteBookByIdAndYears(int firstYear, int secondYear, int id) {
        // удаление книги по промежутку лет и id
    }

    public void deleteAuthorById(int id) {
        authorRepo.deleteById(id);
    }

    public List<Book> getAllBooksByAuthor(String lastName) {
        // получение списка книг автора по фамилии
    }

    public List<Book> getAllBooksInYears(int firstYear, int secondYear) {
        // получение списка книг выпущенных между определенными годами
    }

}
