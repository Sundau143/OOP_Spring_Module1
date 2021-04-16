package com.module.module_1;
import com.sun.istack.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")

public class Author {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Column(name = "first_name")
    @Size(min = 5, max = 40)
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    @Size(min = 2, max = 35)
    private String lastName;
    @NotNull
    @Column(name = "middle_name")
    @Size(min = 8, max = 40)
    private String middleName;

    @ManyToMany
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    Set<Book> books;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastNameName(){
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Author(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Author() {

    }



}
