package org.daming.graphql.web;

import org.daming.graphql.entity.Author;
import org.daming.graphql.entity.input.AuthorInput;
import org.daming.graphql.repository.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private final AuthorRepository authorRespository;

    @MutationMapping
    public Author createAuthor(@Argument AuthorInput authorInput) {
        var author = new Author();
        BeanUtils.copyProperties(authorInput, author);
        return this.authorRespository.save(author);
    }

    public AuthorController(AuthorRepository authorRespository) {
        this.authorRespository = authorRespository;
    }
}
