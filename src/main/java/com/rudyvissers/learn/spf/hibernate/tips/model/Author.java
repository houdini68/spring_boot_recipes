package com.rudyvissers.learn.spf.hibernate.tips.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "author", schema = "bookstore") // TIP 7 - name and schema of the table
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    private String firstName;

    @Column(name = "lname") // TIP 8 - name of the col
    private String lastName;

    private String version;

    // either ORDINAL (int) or STRING (char) used to persist AuthorStatus
    @Enumerated(EnumType.STRING)
    private AuthorStatus status;

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(version, author.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, version);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AuthorStatus getStatus() {
        return status;
    }

    public void setStatus(AuthorStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", version='" + version + '\'' +
                ", status=" + status +
                '}';
    }
}
