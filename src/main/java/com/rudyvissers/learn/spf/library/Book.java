package com.rudyvissers.learn.spf.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {
    private List<String> authors = new ArrayList<>();
    private String isbn;
    private String titles;

    public Book() {
    }

    public Book(String isbn, String titles, String... authors) {
        this.isbn = isbn;
        this.titles = titles;
        this.authors.addAll(Arrays.asList(authors));
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", isbn='" + isbn + '\'' +
                ", titles='" + titles + '\'' +
                '}';
    }
}
