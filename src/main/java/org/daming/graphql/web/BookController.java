package org.daming.graphql.web;

import org.daming.graphql.entity.Author;
import org.daming.graphql.entity.Book;
import org.daming.graphql.entity.input.BookInput;
import org.daming.graphql.repository.AuthorRepository;
import org.daming.graphql.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Objects;

@Controller
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRespository;

    @QueryMapping
    public List<Book> allBooks() {
        return this.bookRepository.findAll();
    }

    @QueryMapping
    public Book bookByIsbn(@Argument String isbn) {
        return this.bookRepository.findByIsbn(isbn);
    }

    @SchemaMapping(typeName = "Book", field = "author")
    public Author getAuthor(Book book) {
        var author = this.authorRespository.findByIdCardNo(book.getAuthorIdCardNo());
        return Objects.requireNonNullElseGet(author, Author::new);
    }

    @MutationMapping
    public Book createBook(@Argument BookInput bookInput) {
        var book = new Book();
        BeanUtils.copyProperties(bookInput, book);
        return this.bookRepository.save(book);
    }

    public BookController(BookRepository bookRepository, AuthorRepository authorRespository) {
        this.bookRepository = bookRepository;
        this.authorRespository = authorRespository;
    }
}
