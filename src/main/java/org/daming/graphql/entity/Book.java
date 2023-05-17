package org.daming.graphql.entity;

import com.google.common.base.MoreObjects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String isbn;

    private String title;

    private Integer pages;

    private String authorIdCardNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthorIdCardNo() {
        return authorIdCardNo;
    }

    public void setAuthorIdCardNo(String authorIdCardNo) {
        this.authorIdCardNo = authorIdCardNo;
    }

    public Book(Long id, String isbn, String title, Integer pages, String authorIdCardNo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.authorIdCardNo = authorIdCardNo;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("isbn", isbn)
                .add("title", title)
                .add("pages", pages)
                .add("authorIdCardNo", authorIdCardNo)
                .toString();
    }
}
