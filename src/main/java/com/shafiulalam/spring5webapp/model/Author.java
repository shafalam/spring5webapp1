package com.shafiulalam.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public String getFirstname() {
        return firstname;
    }
    public Author(){

    }
    public void Author(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
