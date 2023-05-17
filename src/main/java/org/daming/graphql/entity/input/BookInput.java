package org.daming.graphql.entity.input;

import com.google.common.base.MoreObjects;

public class BookInput {

    private String isbn;

    private String title;

    private Integer pages;

    private String authorIdCardNo;

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

    public BookInput(String isbn, String title, Integer pages, String authorIdCardNo) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.authorIdCardNo = authorIdCardNo;
    }

    public BookInput() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("isbn", isbn)
                .add("title", title)
                .add("pages", pages)
                .add("authorIdCardNo", authorIdCardNo)
                .toString();
    }
}
