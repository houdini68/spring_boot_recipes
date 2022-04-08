package com.rudyvissers.learn.spf.hibernate.tips.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "author", schema = "bookstore")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String version;

    public Author() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && firstName.equals(author.firstName) && lastName.equals(author.lastName) && Objects.equals(version, author.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, version);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
